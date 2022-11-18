package lesson_02.homework_03;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x * 2);
        } else if (x < 0) {
            System.out.println(x + 1);
        } else if (x == 0) {
            System.out.println(0);
        }
    }
}
