package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr3 {
//    1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
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
