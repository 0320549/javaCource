package lesson_09_10.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
//1. Введи с клавиатуры 10 слов в список строк.
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//3. Выведи результат на экран, каждое значение с новой строки.

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        doubleValues(list);
        for (String c:list) {
            System.out.println(c);
        }
    }

    public static void doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i) + ", " + list.get(i));
            list.remove(i+1);
        }
    }
}
