package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr5 {
    //    1. Считать 6 строк и заполнить ими массив strings.
//    2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] != null) {
                    if (array[i].equals(array[j])) {
                        array[i] = null;
                        array[j] = null;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

    }
}
