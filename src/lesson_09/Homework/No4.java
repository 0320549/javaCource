package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
    //1. Создай список строк в методе main.
//2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String s = scanner.nextLine();
            list.add(0, s);
        }
        for (String c : list) {
            System.out.println(c);
        }
    }
}
