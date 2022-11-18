package lesson_04.homework_04;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int[] array = new int[20];
        int max = array[0];
        int min = array[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            if (array[0] < array[i])
                max = array[i];
        }
        for (int i = 0; i < 20; i++) {
            if (array[0] > array[i])
                min = array[i];
        }
        System.out.print(max + " " + min);
    }
}