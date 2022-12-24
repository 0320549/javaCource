package lesson_15_1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No1 {
//    Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра.
//    Результат выведи на экран в алфавитном порядке.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // alf
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = scanner.nextLine();
            list.add(line.toLowerCase());
        }
        int summ = 0;
        for (int i = 0; i < alphabet.size(); i++) {
                for (String lest: list) {
                    for (char c : lest.toCharArray()) {
                        if (alphabet.get(i) == c) {
                            summ++;
                        }
                    }
                }
            System.out.println(alphabet.get(i) + " : " + summ);
            summ = 0;
        }
    }
}
