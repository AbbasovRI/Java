package homeworks.homework06;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя покупателя: ");
        String name = scanner.nextLine();
        System.out.print("Введите сумму денег у покупателя: ");
        double money = Double.parseDouble(scanner.nextLine());
        Person person = new Person(name, money);

        while (true) { //задаем цикл с условием
            System.out.print("Введите наименование продукта (для завершения введите END): ");
            String productName = scanner.nextLine();
            if (productName.equals("END")) {
                break;
            }

            System.out.print("Введите стоимость продукта: ");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(productName, price);
            person.buyProduct(product);
        }
        if (person.EmptyBasket()) {
            System.out.println(person.getName() + " ничего не купил");
        } else {
            System.out.println(person.toString());
        }
    }
}
