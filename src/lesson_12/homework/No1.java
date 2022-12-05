package lesson_12.homework;

import java.util.HashMap;
import java.util.Map;

public class No1 {
    //1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
    //2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    //3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
    //4. Вывести содержимое Map на экран.
    public static void main(String[] args) {
        HashMap<String, String> fio = new HashMap<>();
        fio.put("Иванов", "Александр");
        fio.put("Сидоров", "Ваня");
        fio.put("Иванов", "Боря");
        fio.put("Булик", "Толик");
        fio.put("Махин", "Ваня");
        fio.put("Турцев", "Николай");
        fio.put("Сидоров", "Александр");
        fio.put("Трубич", "Ольга");
        fio.put("Булько", "Толик");
        fio.put("Тихонова", "Татьяна");
        for (Map.Entry<String, String> entry : fio.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
