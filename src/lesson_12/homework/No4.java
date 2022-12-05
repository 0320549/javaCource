package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;

public class No4 {
    // Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
    //арбуз - ягода,
    //банан - трава,
    //вишня - ягода,
    //груша - фрукт,
    //дыня - овощ,
    //ежевика - куст,
    //жень-шень - корень,
    //земляника - ягода,
    //ирис - цветок,
    //картофель - клубень.
    //Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    //
    //Пример вывода (тут показана только одна строка):
    //картофель - клубень
    public static void main(String[] args) {
        HashMap<String , String> arbuz = new HashMap<>();
        arbuz.put("арбуз", "ягода");
        arbuz.put("банан", "трава");
        arbuz.put("вишня", "ягода");
        arbuz.put("груша", "фрукт");
        arbuz.put("дыня", "овощ");
        arbuz.put("ежевика", "куст");
        arbuz.put("жень-шень", "корень");
        arbuz.put("земляника", "ягода");
        arbuz.put("ирис", "цветок");
        arbuz.put("картофель", "клубень");
        for (Map.Entry<String, String> entry : arbuz.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
