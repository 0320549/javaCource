package lesson_05.homewirk_05;

import java.util.Scanner;

public class MasStr2 {
//    Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();}
        for (int i = 0; i < array.length; i++) {
            String max = array [0];
             if (max.length() < array[i].length()) {
                max = array[i];
                System.out.println(max + " " + max.length());
        }}
        for (int i = 0; i < array.length; i++) {
            String min = array[0];
            if (min.length() > array[i].length()) {
                min = array[i];
                System.out.println(min + " " + min.length());
            }}


    }
}
