package homework.homework02;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        int dif = a - b;
        int multi = a * b;
        double average = (double)((a + b) / 2);
        int distance = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Сумма чисел = " + sum);
        System.out.println("Разница чисел = " + dif);
        System.out.println("Произведение чисел = " + multi);
        System.out.println("Среднее значение = " + average);
        System.out.println("Расстояние = " + distance);
        System.out.println("Максимум = " + max);
        System.out.println("Минимум= " + min);
    }
}
