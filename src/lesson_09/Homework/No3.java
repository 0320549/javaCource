package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
// 1. Создай список строк.
// 2. Считай с клавиатуры 5 строк и добавь в список.
// 3. Используя цикл, найди самую короткую строку в списке.
// 4. Выведи найденную строку на экран.
// 5. Если таких строк несколько, выведи каждую с новой строки.

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        String min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min.length() > list.get(i).length()) {
                min = list.get(i);
            }
        }
        System.out.println(min);

    }
}
