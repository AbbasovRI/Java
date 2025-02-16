package homeworks.homework09;

import java.util.Collection;
public class ShowCar extends Car {
    // Дополнительное поле
    private int stars;

    // Пустой конструктор
    public ShowCar() {
        super(); // Вызываем конструктор родителя
        stars = 0; // По умолчанию звезды равны нулю
    }

    // Конструктор с параметрами
    public ShowCar(String make, String model, int year, int horsePower, int acceleration, int suspension, int durability, int stars) {
        super(make, model, year, horsePower, acceleration, suspension, durability); // Передаем параметры родителю
        this.stars = stars; // Устанавливаем количество звезд
    }

    // Геттеры и сеттеры для количества звезд
    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "ShowCar{" +
                "stars=" + stars +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", horsePower=" + getHorsePower() +
                ", acceleration=" + getAcceleration() +
                ", suspension=" + getSuspension() +
                ", durability=" + getDurability() +
                '}';
    }

    // Переопределённые методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowCar)) return false;
        if (!super.equals(o)) return false;

        ShowCar showCar = (ShowCar) o;

        return stars == showCar.stars;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + stars;
        return result;
    }
}