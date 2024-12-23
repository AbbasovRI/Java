package homework.homework02;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = scanner.nextLine();
        System.out.println("Введите количество повторений");
        int number = scanner.nextInt();
        String repeated = a.repeat(number);
        System.out.println(repeated);
    }
}
