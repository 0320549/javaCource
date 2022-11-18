package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr4 {
//    Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    public static void main(String[] args) {
        int[] array = new int[10];
        String[] array2 = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            array2[i] = scanner.next();
        }
        for (int i = 0; i < 10; i++) {
            array[i] = array2[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }
}
