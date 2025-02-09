package homeworks.homeworks07.product;

import java.util.Objects;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws IllegalArgumentException {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустой строкой.");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("Название продукта должно содержать минимум три символа.");
        }
        if (name.matches("\\d+")) {
            throw new IllegalArgumentException("Название продукта не может состоять только из цифр.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price <= 0) {
            throw new IllegalArgumentException("Стоимость продукта не может быть нулевой или отрицательной.");
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}