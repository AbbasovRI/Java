package homeworks.homework01;

public class SecondTask {
    public static void main(String[] args) {
        int Vasya = (int)(Math.random() * (double)3.0F);
        if (Vasya == 0) {
            System.out.println("Вася выкинул камень");
        } else if (Vasya == 1) {
            System.out.println("Вася выкинул ножницы");
        } else if (Vasya == 2) {
            System.out.println("Вася выкинул бумагу");
        }

        int Petya = (int)(Math.random() * (double)3.0F);
        if (Petya == 0) {
            System.out.println("Петя выкинул камень");
        } else if (Petya == 1) {
            System.out.println("Петя выкинул ножницы");
        } else if (Petya == 2) {
            System.out.println("Петя выкинул бумагу");
        }

        if (Petya == 0) {
            if (Vasya == 0) {
                System.out.println("Ничья");
            } else if (Vasya == 1) {
                System.out.println("Выиграл Петя");
            } else if (Vasya == 2) {
                System.out.println("Выиграл Вася");
            }
        } else if (Petya == 1) {
            if (Vasya == 0) {
                System.out.println("Победил Вася");
            } else if (Vasya == 1) {
                System.out.println("Ничья");
            } else if (Vasya == 2) {
                System.out.println("Победил Петя");
            }
        } else if (Petya == 2) {
            if (Vasya == 0) {
                System.out.println("Победил Петя");
            } else if (Vasya == 1) {
                System.out.println("Победил Вася");
            } else if (Vasya == 2) {
                System.out.println("Ничья");
            }
        }

    }
}
