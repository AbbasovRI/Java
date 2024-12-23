//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Arrange {
    public Arrange() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите два слова на английском языке");
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        for(int i = 0; i < words.length; ++i) {
            char[] letters = words[i].toLowerCase().toCharArray();
            Arrays.sort(letters);
            PrintStream var10000 = System.out;
            String var10001 = new String(letters);
            var10000.print(var10001 + " ");
        }

    }
}
