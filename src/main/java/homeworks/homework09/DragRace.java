package homeworks.homework09;

import java.util.Collection;
public class DragRace extends Race {
    // Пустой конструктор
    public DragRace() {
        super();
    }

    // Конструктор с параметрами
    public DragRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }
}