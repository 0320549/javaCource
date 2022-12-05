package lesson_12.homework;

import java.util.HashMap;
import java.util.Scanner;

public class No3 {
    // Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
    //Новая задача: Программа должна работать не с номерами домов, а с городами:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            String family = scanner.nextLine();
            map.put(city, family);
        }
        String city = scanner.nextLine();
        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
}
