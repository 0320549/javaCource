package lesson_15_1.homework;

import java.util.*;

public class No5 {
// Пользователь вводит с клавиатуры список слов (и чисел).
//Слова вывести в возрастающем порядке, числа - в убывающем.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> slov = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine();
            if (s.isEmpty())
                break;
            slov.add(s);
        }
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < slov.size(); i++) {
            if (!isNumber(slov.get(i))) {
                list1.add(slov.get(i));
            }
        }
        Collections.sort(list1);
        for (int i = 0; i < slov.size(); i++) {
            if (isNumber(slov.get(i))) {
                list2.add(Integer.parseInt(slov.get(i)));
            }
        }
        Collections.sort(list2);
        for (String r : list1) {
            System.out.println(r);
        }
        for (int i = list2.size() - 1; i >= 0 ; i--) {
            System.out.println(list2.get(i));
        }
    }
        public static boolean isNumber (String s) {
            if (s.length() == 0)
                return false;
            for (char b : s.toCharArray()) {
                if (!Character.isDigit(b))
                    return false;
            }
            return true;
        }
}
