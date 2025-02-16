package homeworks.homework09;

import java.util.Collection;
public class Car {
    // Поля
    private String make;
    private String model;
    private int year;
    private int horsePower;
    private int acceleration;
    private int suspension;
    private int durability;

    // Пустой конструктор
    public Car() {}

    // Конструктор с параметрами
    public Car(String make, String model, int year, int horsePower, int acceleration, int suspension, int durability) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
    }

    // Геттеры и сеттеры
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    public int getAcceleration() { return acceleration; }
    public void setAcceleration(int acceleration) { this.acceleration = acceleration; }

    public int getSuspension() { return suspension; }
    public void setSuspension(int suspension) { this.suspension = suspension; }

    public int getDurability() { return durability; }
    public void setDurability(int durability) { this.durability = durability; }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                ", acceleration=" + acceleration +
                ", suspension=" + suspension +
                ", durability=" + durability +
                '}';
    }

    // Переопределённые методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (horsePower != car.horsePower) return false;
        if (acceleration != car.acceleration) return false;
        if (suspension != car.suspension) return false;
        if (durability != car.durability) return false;
        if (!make.equals(car.make)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        result = 31 * result + horsePower;
        result = 31 * result + acceleration;
        result = 31 * result + suspension;
        result = 31 * result + durability;
        return result;
    }
}