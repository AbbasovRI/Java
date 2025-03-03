package homeworks.homework09;

import java.util.Collection;
public class CasualRace extends Race {
    // Пустой конструктор
    public CasualRace() {
        super();
    }

    // Конструктор с параметрами
    public CasualRace(int length, String route, int prizeFund, Collection<Car> participants) {
        super(length, route, prizeFund, participants);
    }
}