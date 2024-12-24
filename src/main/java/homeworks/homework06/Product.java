package homeworks.homework06;
public class Product {
    private String name; //наименование продукта
    private double price; //стоимость продукта

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { //
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Продукт: " + getName() + ", цена: " + getPrice();
    }
}
