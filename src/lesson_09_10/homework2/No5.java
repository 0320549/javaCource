package lesson_09_10.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < list.size()-1; i++) {
           if (list.get(i).length() > list.get(i+1).length()) {
               System.out.println(list.indexOf(list.get(i+1)));
               break;
           }
        }
    }
}
