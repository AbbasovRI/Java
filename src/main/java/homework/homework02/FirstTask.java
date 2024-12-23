package homework.homework02;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Фаренгейта");
        double Far = (double)scanner.nextInt();
        double Cel = (Far - (double)32.0F) * (double)5.0F / (double)9.0F;
        String result = String.format("%.1f", Cel);
        System.out.println("Температура в градусах по Цельсию составит " + result);
    }
}
