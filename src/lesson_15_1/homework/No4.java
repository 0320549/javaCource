package lesson_15_1.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
//Написать программу, которая вводит с клавиатуры строку текста.
//Программа должна вывести на экран две строки:
//1. первая строка содержит только гласные буквы из введённой строки.
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//Пример ввода:
//Мама мыла раму.
//
//Пример вывода:
//а а ы а а у
//М м м л р м .
        public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

        public static void main(String[] args) throws Exception {
//напишите тут ваш код
            Scanner scanner = new Scanner(System.in);
            String stroka = scanner.nextLine();
            ArrayList<String> gl = new ArrayList<>();
            ArrayList<String> sog = new ArrayList<>();
            char [] array = stroka.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (isVowel(array[i])) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                if (isVowel(array[i]) == false) {
                    System.out.print(array[i] + " ");
                }
            }
        }

// метод проверяет, гласная ли буква
        public static boolean isVowel(char character) {
            character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
            for (char vowel : vowels) { // ищем среди массива гласных
                if (character == vowel) {
                    return true;
                }
            }
            return false;
        }
    }

