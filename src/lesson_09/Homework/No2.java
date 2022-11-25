package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No2 {
    // 1. Создай список строк.
// 2. Считай с клавиатуры 5 строк и добавь в список.
// 3. Используя цикл, найди самую длинную строку в списке.
// 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        String max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
