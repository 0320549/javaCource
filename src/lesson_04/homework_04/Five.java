package lesson_04.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array1[i] = scanner.nextInt();
        }
        array2 = Arrays.copyOfRange(array1, 0, 9);
        array3 = Arrays.copyOfRange(array1, 10, 20);
        for (int i = 0; i < 10; i++) {
            System.out.println(array3[i]);
        }
    }
}