package homeworks.homework06;
public class Person {
    private String name; // имя покупателя
    private double money; // деньги у покупателя
    private Product[] products; // массив продуктов
    private int productCount; // счетчик продуктов

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
        this.products = new Product[10]; // максимальное количество продуктов
        this.productCount = 0;
    }

    public String getName() { //
        return name;
    }

    public double getMoney() { //
        return money;
    }

    public Product[] getProducts() {
        return products;
    }

    public void buyProduct(Product product) { // метод для покупки продуктов
        if (this.money >= product.getPrice()) { // если денег больше, чем цена продукта
            if (productCount < products.length) { // проверяем, есть ли место в массиве
                this.products[productCount++] = product; // покупаем продуктов, счетчик увеличиваем
                this.money -= product.getPrice(); // из денег вычитаем стоимость продукта
            } else {
                System.out.println("Пакет покупателя заполнен!");
            }
        } else {
                 System.out.println(getName() + " не может позволить себе " + product.getName());
        }
    }

    public boolean EmptyBasket() { // метод проверки на пустую корзину
        return productCount == 0;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder(); //создаем экземпляр класса стрингбилдера
        text.append("Покупатель: ").append(getName()).append(", деньги: ").append(getMoney()).append("\n"); //  преобразовываем в строку и добавляем к текущей строке, переходим на новую строку
        text.append("Продукты:\n");
        for (int i = 0; i < productCount; i++) { //проходим по количеству купленных продуктов
                text.append(products[i].getName()).append("\n"); //выводим список продуктов
        }
            return text.toString();
        }
}
