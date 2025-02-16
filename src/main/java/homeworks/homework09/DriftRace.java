package homeworks.homework09;

import java.util.Collection;
public class DriftRace extends Race {
    // Пустой конструктор
    public DriftRace() {
        super();
    }

    // Конструктор с параметрами
    public DriftRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }
}