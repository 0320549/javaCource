package lesson_02.homework_03;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        double t = scanner.nextDouble();

        if ( t>=0 && t <= 2.9) {
            System.out.println("Зеленый");
        }
        else if ( t >= 3 && t <= 3.9 ) {
            System.out.println("Жёлтый");
        }
        else if ( t>= 4 && t<= 4.9 ) {
            System.out.println("Красный");
        }
        else {
            System.out.println("Зеленый");}
    }
}
