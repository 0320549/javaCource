package lesson_09.Homework;

import java.util.ArrayList;

public class No1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Мяч");
        list.add("Дверь");
        list.add("Яхта");
        list.add("Апельсин");
        list.add("Яблоко");
        System.out.println(list.size());
        for (String c : list) {
            System.out.println(c);
        }

    }
}
