package homeworks.homeworks07.person;

import homeworks.homeworks07.product.DiscountProduct;
import homeworks.homeworks07.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void applyDiscount(Product product) {
        double priceToPay = product.getPrice(); // Начальная цена

        if (product instanceof DiscountProduct) {
            DiscountProduct discountProduct = (DiscountProduct) product;
            priceToPay = discountProduct.getPrice() * (1 - discountProduct.getDiscountPercentage() / 100); // Применяем скидку
        }

        if (money >= priceToPay) {
            products.add(product);
            money -= priceToPay;
            System.out.println("Покупка совершена. Цена: " + priceToPay);
        } else {
            System.out.println("Недостаточно средств для покупки.");
        }
    }

    public boolean canAfford(Product product) {
        return money >= product.getPrice();
    }

    private void updateBalance(Product product) {
        money -= product.getPrice();
    }

    private void refund(Product product) {
        money += product.getPrice();
    }

    public boolean hasProducts() {
        return !products.isEmpty();
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Покупатель: ").append(getName()).append(", деньги: ").append(getMoney()).append("\n");
        text.append("Продукты:\n");
        for (Product product : products) {
            text.append(product.getName()).append("\n");
        }
        return text.toString();
    }
}