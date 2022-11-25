package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        for (int i = 0; i < 13; i++) {
            String a = list.get(4);
            list.add(0, a);
            list.remove(5);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
