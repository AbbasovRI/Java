package homeworks.homework09;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {
    // Дополнительные поля
    private List<String> addOns;

    // Пустой конструктор
    public PerformanceCar() {
        super(); // Вызываем конструктор родительского класса
        addOns = new ArrayList<>();
    }

    // Конструктор с параметрами
    public PerformanceCar(String make, String model, int year, int horsePower, int acceleration, int suspension, int durability) {
        super(make, model, year, horsePower, acceleration, suspension, durability); // Передаем параметры родителю
        addOns = new ArrayList<>(); // Создаем список дополнений

        // Изменяем характеристики согласно спецификации
        setHorsePower((int)(getHorsePower() * 1.5)); // Увеличить мощность на 50%
        setSuspension(getSuspension() / 4 * 3); // Уменьшить подвеску на 25%
    }

    // Геттеры и сеттеры для списка дополнений
    public List<String> getAddOns() { return addOns; }
    public void setAddOns(List<String> addOns) { this.addOns = addOns; }

    // Добавление одного дополнения
    public void addAddOn(String addOn) {
        addOns.add(addOn);
    }

    // Удаление одного дополнения
    public void removeAddOn(String addOn) {
        addOns.remove(addOn);
    }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "PerformanceCar{" +
                "addOns=" + addOns +
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
        if (!(o instanceof PerformanceCar)) return false;
        if (!super.equals(o)) return false;

        PerformanceCar that = (PerformanceCar) o;

        return addOns.equals(that.addOns);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + addOns.hashCode();
        return result;
    }
}