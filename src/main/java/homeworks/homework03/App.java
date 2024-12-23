package homeworks.homework03;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Television myTV = new Television();
        System.out.println("Телевизор по умолчанию: " + String.valueOf(myTV));
        System.out.println("Выбираем новый телевизор");
        Television myTV1 = new Television();
        System.out.println("Введите бренд интересуемого телевизора");
        myTV1.setBrand(scanner.nextLine());
        System.out.println("Введите модель интересуемого телевизора");
        myTV1.setModel(scanner.nextLine());
        System.out.println("Введите диагональ интересуемого телевизора");
        myTV1.setDiagonal(Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите панель интересуемого телевизора");
        myTV1.setPanel(scanner.nextLine());
        System.out.println("Введите частоту кадров интересуемого телевизора");
        myTV1.setFps(Integer.parseInt(scanner.nextLine()));
        System.out.println("Введите вес интересуемого телевизора");
        myTV1.setWeight(Double.parseDouble(scanner.nextLine()));
        System.out.println("Выбран телевизор со следующими параметрами: " + String.valueOf(myTV1));
        Television myTV2 = new Television("LG", "OLED42", 50, "LCD", 60, (double)12.0F);
        System.out.println("Предлагаем приобрести телевизор: " + String.valueOf(myTV2));
    }
}
