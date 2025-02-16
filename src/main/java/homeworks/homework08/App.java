package homeworks.homework08;

import homeworks.homework08.person.Person;
import homeworks.homework08.product.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public App() {}

    public static void main(String[] args) {
        Map<String, Person> persons = new HashMap<>();
        List<Product> products = new ArrayList<>();

        try {
            readInputFile(persons, products);
            processCommands(persons, products);
            writeOutputFile(persons);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void readInputFile(Map<String, Person> persons, List<Product> products) throws IOException, IllegalArgumentException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("src/main/java/homeworks/homework08/input.txt"));

        String line;
        int lineNumber = 0;
        while ((line = reader.readLine()) != null) {
            if (!line.isBlank()) {
                if (lineNumber == 0) {
                    parseBuyers(line, persons);
                } else if (lineNumber == 1) {
                    parseProducts(line, products);
                } else {
                    parseCommand(line, persons, products);
                }
                lineNumber++;
            }
        }

        reader.close();
    }

    private static void parseBuyers(String line, Map<String, Person> persons) throws IllegalArgumentException {
        String[] parts = line.split(";");
        for (String part : parts) {
            String[] data = part.trim().split("=");
            if (data.length == 2) {
                String name = data[0].trim();
                double money = Double.parseDouble(data[1].trim());
                persons.put(name, new Person(name, money));
            }
        }
    }

    private static void parseProducts(String line, List<Product> products) throws IllegalArgumentException {
        String[] parts = line.split(";");
        for (String part : parts) {
            String[] data = part.trim().split("=");
            if (data.length == 2) {
                String productName = data[0].trim();
                double price = Double.parseDouble(data[1].trim());
                products.add(new Product(productName, price));
            }
        }
    }

    private static void parseCommand(String command, Map<String, Person> persons, List<Product> products) {
        String[] parts = command.split(" ");
        if (parts.length == 2) {
            String buyerName = parts[0];
            String productName = parts[1];

            Person buyer = persons.get(buyerName);
            Product product = findProductByName(productName, products);

            if (buyer != null && product != null) {
                if (buyer.canAfford(product)) {
                    buyer.buyProduct(product);
                    System.out.println(buyer.getName() + " купил " + product.getName());
                } else {
                    System.out.println(buyer.getName() + " не может позволить себе " + product.getName());
                }
            }
        }
    }

    private static Product findProductByName(String productName, List<Product> products) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    private static void processCommands(Map<String, Person> persons, List<Product> products) {
        for (Map.Entry<String, Person> entry : persons.entrySet()) {
            Person buyer = entry.getValue();
            for (Product product : products) {
                if (buyer.canAfford(product)) {
                    buyer.buyProduct(product);
                    System.out.println(buyer.getName() + " купил " + product.getName());
                } else {
                    System.out.println(buyer.getName() + " не может позволить себе " + product.getName());
                }
            }
        }
    }

    private static void writeOutputFile(Map<String, Person> persons) throws IOException {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Person> entry : persons.entrySet()) {
            Person person = entry.getValue();
            output.append(person.getName()).append(" - ");
            if (person.hasProducts()) {
                for (Product product : person.getProducts()) {
                    output.append(product.getName()).append(", ");
                }
                output.delete(output.length() - 2, output.length());
            } else {
                output.append("Ничего не куплено");
            }
            output.append("\n");
        }

        Files.writeString(Paths.get("src/main/java/homeworks/homework08/output.txt"), output.toString());
    }
}