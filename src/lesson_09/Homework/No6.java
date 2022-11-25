package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No6 {
// 1. Создай список строк.
// 2. Добавь в него 10 строчек с клавиатуры.
// 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
// 4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        list.add(scanner.nextLine());
    }
    String max = list.get(0);
    int maxInd = 0;
    for (int i = 0; i < list.size(); i++) {
        if (max.length() < list.get(i).length()) {
            max = list.get(i);
            maxInd = i;
        }
    }
    String min = list.get(0);
    int minInd = 0;
    for (int i = 0; i < list.size(); i++) {
        if (min.length() > list.get(i).length()) {
            min = list.get(i);
            minInd = i;
        }
    }
        for (int i = 0; i < list.size(); i++) {
            if (maxInd < minInd) {
                System.out.println(max);
                break;
            }
            else if (maxInd > minInd) {
                System.out.println(min);
                break;
            }
    }
}
}
