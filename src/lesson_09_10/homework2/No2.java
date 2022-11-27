package lesson_09_10.homework2;

import java.util.ArrayList;

public class No2 {
//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Мама");
        list.add("Мыла");
        list.add("Раму");
        for (int i = 0; i < list.size(); i++) {
            list.add(1, "Именно");
            list.add(3, "Именно");
            list.add(5, "Именно");
            break;
        }
        for (String l : list) {
            System.out.println(l);
        }
    }
}
