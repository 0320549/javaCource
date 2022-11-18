package lesson_04.homework_04;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 19; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        }
    }