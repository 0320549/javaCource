package lesson_09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        int [] array = new int [7];
        int a = 0;
        Integer b = 10;

        // 1. Создание коллекции и добавление в нее элементов
        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);

        // 2.  Метод add()  - добавление с указанием индекса

        list.add(2, 88);

        // 3. Метод set() - затирает значение по опред индексу

        list.set(3, 99);

        // 4. Метод size() - возварщает размер колекции

        System.out.println(list.size());

        // 5. метод get() - брать объекты нашей коллекции

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " , ");
        }

        System.out.println();

        for (Integer c : list) {
            System.out.print(c + " , ");
        }

        System.out.println();

        // 6. toArray() - преобразование коллекции в массив

        Object [] objects = list.toArray();

        for (Object o: objects) {
            System.out.print(o + " , ");
        }

        System.out.println();

        // 7. Метод contains() - содержит ли коллекция определенный элемент

        System.out.println("В коллекции содержится ячисло 101 - " + list.contains(101));
        System.out.println("В коллекции содержится ячисло 88 - " + list.contains(88));

        // 8. addAll() - добавить все эллементы в новую коллекцию из старой

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);

        // 9. remove() - удаление элементов коллекции по определенному индексу

        System.out.println("До вызова метода ремов по индексу 0" + " " + list);
        list.remove(0);
        System.out.println("После вызова метода ремов по индексу 0" + list);

        // 10. indexOf - метод, возвращающий индекс элемента коллекции

        System.out.println("Индекс элдемента 88 " + list.indexOf(88));

        // 11. sort() - сортировка

//        List<Integer> list1 = new ArrayList<>();
//        list1.add(11);
//        list1.add(99);
//        list1.add(77);
//        list1.add(22);

        // 12. isEmpty() - проверка пустой лист или нет

        System.out.println(list.isEmpty());

        // 13. clear() - удаление всех элементов коллекции

        list.clear();




        System.out.println();
    }
}
