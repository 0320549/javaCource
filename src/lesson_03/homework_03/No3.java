package lesson_03.homework_03;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < 1; i++) {
            if (x < r && x > n) {
                System.out.println(x);
            } else if (r < x && r > n) {
                System.out.println(r);
            } else if (n < x && n > r) {
                System.out.println(n);
            } else if (x == r && r == n) {
                System.out.println(x);
            }
        }

    }
}

