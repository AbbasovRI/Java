package homeworks.homeworks07.product;

import java.time.LocalDate;

public class DiscountProduct extends Product {
    private int discountPercentage;
    private LocalDate discountExpirationDate;
    private boolean isActive;

    public DiscountProduct(String name, double price, int discountPercentage, LocalDate discountExpirationDate, boolean isActive) throws IllegalArgumentException {
        super(name, price);
        setDiscountPercentage(discountPercentage);
        setDiscountExpirationDate(discountExpirationDate);
        this.isActive = isActive && LocalDate.now().isBefore(discountExpirationDate); // скидка еще действительна
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) throws IllegalArgumentException {
        if (discountPercentage <= 0 || discountPercentage > 99) {
            throw new IllegalArgumentException("Размер скидки должен быть больше 0 и меньше 100.");
        }
        this.discountPercentage = discountPercentage;
    }

    public LocalDate getDiscountExpirationDate() {
        return discountExpirationDate;
    }

    public void setDiscountExpirationDate(LocalDate discountExpirationDate) throws IllegalArgumentException {
        if (discountExpirationDate == null) {
            throw new IllegalArgumentException("Срок действия скидки не может быть пустым.");
        }
        this.discountExpirationDate = discountExpirationDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "DiscountProduct{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", discountPercentage=" + discountPercentage +
                ", discountExpirationDate=" + discountExpirationDate +
                ", isActive=" + isActive +
                '}';
    }
}