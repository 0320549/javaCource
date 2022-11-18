package lesson_04.homework_04;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = array[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
