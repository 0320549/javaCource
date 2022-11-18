package lesson_03.homework_03;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = 0;
       int sum = 0;
       while (true) {
           number = scanner.nextInt();
           if (number != -1) {
               sum += number;
           }
           else if (number == -1) {
               sum -= 1;
           System.out.println(sum);
           break; }
       }
    }
}
