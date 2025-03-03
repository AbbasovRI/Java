package homeworks.homework09;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Garage {
    // Поле
    private List<Car> parkedCars;

    // Пустой конструктор
    public Garage() {
        parkedCars = new ArrayList<>();
    }

    // Конструктор с параметрами
    public Garage(List<Car> cars) {
        parkedCars = cars;
    }

    // Геттеры и сеттеры
    public List<Car> getParkedCars() { return parkedCars; }
    public void setParkedCars(List<Car> parkedCars) { this.parkedCars = parkedCars; }

    // Методы для работы с машинами
    public void addCar(Car car) {
        parkedCars.add(car);
    }

    public void removeCar(Car car) {
        parkedCars.remove(car);
    }

    public void modifyCar(Car car, String property, Object value) {
        switch(property.toLowerCase()) {
            case "make":
                car.setMake((String)value);
                break;
            case "model":
                car.setModel((String)value);
                break;
            case "year":
                car.setYear((Integer)value);
                break;
            case "horsepower":
                car.setHorsePower((Integer)value);
                break;
            case "acceleration":
                car.setAcceleration((Integer)value);
                break;
            case "suspension":
                car.setSuspension((Integer)value);
                break;
            case "durability":
                car.setDurability((Integer)value);
                break;
            default:
                System.out.println("Неизвестное свойство");
        }
    }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "Garage{" +
                "parkedCars=" + parkedCars +
                '}';
    }

    // Переопределённые методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garage)) return false;

        Garage garage = (Garage) o;

        return parkedCars.equals(garage.parkedCars);
    }

    @Override
    public int hashCode() {
        return parkedCars.hashCode();
    }
}