package homeworks.homework09;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
public class App {
    public static void main(String[] args) {
        // Создание экземпляров автомобилей
        Car basicCar = new Car("Toyota", "Corolla", 2020, 150, 8, 7, 9);
        PerformanceCar performanceCar = new PerformanceCar("Ferrari", "488 Pista", 2019, 720, 10, 6, 8);
        ShowCar showCar = new ShowCar("Lamborghini", "Aventador SVJ", 2021, 770, 12, 5, 7, 5);

        // Добавляем дополнение к гоночному автомобилю
        performanceCar.addAddOn("Spoiler");

        // Вывод информации об автомобилях
        System.out.println(basicCar);
        System.out.println(performanceCar);
        System.out.println(showCar);

        // Создание гонки
        List<Car> participants = Arrays.asList(basicCar, performanceCar, showCar);
        CasualRace casualRace = new CasualRace(10000, "City Circuit", 500000, participants);

        // Вывод информации о гонке
        System.out.println(casualRace);

        // Создание гаража
        Garage garage = new Garage(participants);

        // Модификация автомобиля в гараже
        garage.modifyCar(basicCar, "horsePower", 170);

        // Вывод информации о гараже
        System.out.println(garage);
    }
}