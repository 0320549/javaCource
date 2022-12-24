package lesson_15_1.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No2 {
    // Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
    //Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
    //Ключевые требования:
    //Пустая строка - конец ввода данных.
    //Числа могут повторяться.
    //Строки всегда уникальны.
    //Введенные данные не должны потеряться!
    //Затем программа должна выводить содержание HashMap на экран.
    //Каждую пару - с новой строки.
    //Пример ввода:
    //1
    //Мама
    //2
    //Рама
    //1
    //Мыла
    //Пример вывода:
    //1 Мыла
    //2 Рама
    //1 Мама
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        while (true) {
        String chislo = scanner.nextLine();
        if (chislo.isEmpty()) {
            break;
        }
        Integer chislo1 = Integer.parseInt(chislo);
        String slovo = scanner.nextLine();
        map.put(chislo1, slovo);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}
