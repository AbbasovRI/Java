package homeworks.homework09;

import java.util.Collection;
public abstract class Race {
    // Поля
    protected int length;
    protected String route;
    protected int prizeFund;
    protected Collection<Car> participants;

    // Пустой конструктор
    public Race() {}

    // Конструктор с параметрами
    public Race(int length, String route, int prizeFund, Collection<Car> participants) {
        this.length = length;
        this.route = route;
        this.prizeFund = prizeFund;
        this.participants = participants;
    }

    // Геттеры и сеттеры
    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }

    public int getPrizeFund() { return prizeFund; }
    public void setPrizeFund(int prizeFund) { this.prizeFund = prizeFund; }

    public Collection<Car> getParticipants() { return participants; }
    public void setParticipants(Collection<Car> participants) { this.participants = participants; }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "Race{" +
                "length=" + length +
                ", route='" + route + '\'' +
                ", prizeFund=" + prizeFund +
                ", participants=" + participants +
                '}';
    }

    // Переопределённые методы equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Race)) return false;

        Race race = (Race) o;

        if (length != race.length) return false;
        if (prizeFund != race.prizeFund) return false;
        if (!route.equals(race.route)) return false;
        return participants.equals(race.participants);
    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + route.hashCode();
        result = 31 * result + prizeFund;
        result = 31 * result + participants.hashCode();
        return result;
    }
}