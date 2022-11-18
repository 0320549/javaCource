package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr1 {

//    Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = new String[100];
        for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextLine();
            if ( array[i].isEmpty()) break;}
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].toUpperCase());
            }}
}
}

