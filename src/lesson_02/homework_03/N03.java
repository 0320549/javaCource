package lesson_02.homework_03;

import java.util.Scanner;

public class N03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 400 == 0) {
            System.out.println("Количество дней в году:366");
        } else if (x % 100 == 0) {
            System.out.println("Количество дней в году:365");
        } else if (x % 4 == 0) {
            System.out.println("Количество дней в году:366");
        } else {
            System.out.println("Количество дней в году:365");
        }
    }
}
