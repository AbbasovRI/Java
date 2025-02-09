package homeworks.homeworks07;

import homeworks.homeworks07.product.DiscountProduct;
import homeworks.homeworks07.product.Product;
import homeworks.homeworks07.person.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        System.out.print("Введите имя покупателя и количество денежных средств в формате 'Имя = Сумма;', для завершения введите END ");
        while (true) { // Формируем список покупателей и их средств
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            String[] pairs = input.split(";");
            for (String pair : pairs) {
                String[] parts = pair.trim().split("=");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double money = Double.parseDouble(parts[1].trim());
                    persons.add(new Person(name, money));
                }
            }
        }

        System.out.print("Введите наименование продукта, его стоимость и скидку (если есть) в формате 'Продукт = Стоимость, Скидка%;' для завершения введите END ");
        while (true) { // Формируем список продуктов и их цен
            String input2 = scanner.nextLine();
            if (input2.equalsIgnoreCase("END")) {
                break;
            }
            String[] pairs2 = input2.split(";");
            for (String pair : pairs2) {
                String[] parts2 = pair.trim().split("=");
                if (parts2.length == 2) {
                    String productName = parts2[0].trim();
                    String[] priceAndDiscount = parts2[1].trim().split(",");

                    if (priceAndDiscount.length == 1) { // Обычный продукт без скидки
                        double price = Double.parseDouble(priceAndDiscount[0].trim());
                        try {
                            products.add(new Product(productName, price)); // Создаем обычный продукт
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage()); // Обработка исключений при создании продукта
                        }
                    } else if (priceAndDiscount.length == 2) { // Продукт со скидкой
                        double price = Double.parseDouble(priceAndDiscount[0].trim());
                        int discount = Integer.parseInt(priceAndDiscount[1].trim().replace("%", ""));

                        try {
                            products.add(new DiscountProduct(productName, price, discount, LocalDate.now(), true)); // Создаем продукт со скидкой
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage()); // Обработка исключений при создании продукта
                        }
                    } else {
                        System.out.println("Неверный формат ввода. Пожалуйста, попробуйте снова.");
                    }
                }
            }
        }

        for (Person person : persons) { // Перебираем всех покупателей и предлагаем им покупку продуктов
            for (Product product : products) {
                if (person.canAfford(product)) {
                    person.applyDiscount(product);
                } else {
                    System.out.println("Недостаточно средств для покупки.");
                }
            }
        }

        for (Person person : persons) {
            System.out.println(person);
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }
}