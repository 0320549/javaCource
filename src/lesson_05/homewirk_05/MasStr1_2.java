package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr1_2 {

//    Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//Программа выводит слова на экран.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] array = new String[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
            if (array[i].isEmpty()) break;
        }

        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            if (str != null) {
            if (str.length() % 2 == 0) {
                System.out.println(array[i] + " " + array[i]);
            }
            else {
                System.out.println(array [i]+ " " + array[i] + " " + array[i]);
            }

        }}

    }
}
