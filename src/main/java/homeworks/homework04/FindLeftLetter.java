//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class FindLeftLetter {
    public FindLeftLetter() {
    }

    public static void main(String[] args) {
        char[] alphabet = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите одну строчную букву английского алфавита: ");
        char letter = scanner.nextLine().charAt(0);

        for(int i = 0; i < alphabet.length; ++i) {
            if (letter == alphabet[i] && letter != 'q') {
                System.out.print(alphabet[i - 1]);
            } else if (letter == 'q') {
                System.out.print(alphabet[alphabet.length - 1]);
                break;
            }
        }

    }
}
