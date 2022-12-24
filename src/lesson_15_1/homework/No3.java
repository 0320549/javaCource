package lesson_15_1.homework;

import java.util.*;

public class No3 {
    //Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
    //Пояснение:
    //Самое минимальное число - 1-е минимальное.
    //Следующее минимальное после него - 2-е минимальное.
    //
    //Пример:
    //1 6 5 7 1 15 63 88
    //Первое минимальное - 1
    //Второе минимальное - 1
    //Третье минимальное - 5
    //Четвертое минимальное - 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 30; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(9) + " " + list.get(10));
        }
//        int [] array = new int [30];
//        for (int i = 0; i < 30; i++) {
//            array[i] = scanner.nextInt();
//        }
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array [9] + ", " + array[10]);
//        }
    }
}
