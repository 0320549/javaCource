package lesson_09.Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class No7 {
//    1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//1.1 Создай метод printList
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран.
//Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 3 != 0) {
                list1.remove(list1.get(i));
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 != 0) {
                list2.remove(list2.get(i));
            }
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list);
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) % 3 != 0 && list3.get(i) % 2 != 0) {
                list3.remove(list3.get(i));
            }
        }
        printList(list1);
        System.out.println();
        printList(list2);
        System.out.println();
        printList(list3);

    }

    public static void printList (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}