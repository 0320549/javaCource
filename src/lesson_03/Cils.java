package lesson_03;

public class Cils {
    public static void main(String[] args) {
        // Циклы
        // fori, while, foreach

        // fori
//        System.out.println("Hello Worldf");
//        for (int i = 0; i < 5; i++ ) {
//            System.out.println("Hello Worldf");
//        }
//
        // Вывести в цикле все четные числа от 1 до 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 2. Вывести все цифры от 1 до 100 которые делятся на 4 и на 5 однловревенно
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        //3.  Сложить цифры от 10 до 20

        int count = 0;
        for (int i = 10; i <= 20; i++) {
            count = count + i;

        }
        // 4. Вывести в консоль все числа от 10 до 40, но пропустив все цифры от 15 до 20

        for (int i = 10; i <= 40; i++) {
            if (( i >= 10 && i < 15) || (i > 20)) {
                System.out.print(i + " ");
            }
        }
        // Вывусти сумму всех четных чискел от 10 до 50
        int summ = 0;
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                summ += i;

            }
            System.out.println(summ);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println("Обратный отсчет. осталось" +counter + "секунд");
            counter--;
        }


    }
}
