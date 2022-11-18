package lesson_04.homework_04;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        String [] array = new String [10];
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < 8; i++) {
         array [i] = scanner.next();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(array [i] + " ");
        }
    }
}
