//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class ArrowsCount {
    public ArrowsCount() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из символов '>', '<' и '-': ");
        String line = scanner.nextLine();
        int count = 0;

        for(int i = 0; i < line.length() - 4; ++i) {
            if (line.startsWith(">>-->", i) || line.startsWith("<--<<", i)) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
