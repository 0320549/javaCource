package lesson_03.homework_03;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Меня зовут " + name );
        System.out.println("Я родился " + y + ". " + m + ". " + d);

    }
}
