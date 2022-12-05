package lesson_12.homework;

import java.util.HashMap;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        HashMap<String, Integer> year = new HashMap<>();
        year.put("January", 1);
        year.put("February", 2);
        year.put("March", 3);
        year.put("April", 4);
        year.put("May", 5);
        year.put("June", 6);
        year.put("July", 7);
        year.put("August", 8);
        year.put("September", 9);
        year.put("October", 10);
        year.put("November", 11);
        year.put("December", 12);
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
            if (year.containsKey(month)) {
                System.out.println(month + " is the " + year.get(month));
        }
    }
}
