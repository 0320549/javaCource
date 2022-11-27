package lesson_09_10.homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class No1 {
//    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        list.remove(2);
        for (int i = 3; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
