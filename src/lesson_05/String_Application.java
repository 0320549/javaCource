package lesson_05;

public class String_Application {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str1 = new String("Hello World");
        str1 += "!";
        System.out.println(str);
        System.out.println(str1);
        for (int i = 0; i < 10; i++) {
            str1 += "!";
        }
        System.out.println(str1);

        /**
         String !

         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         * */

        str1.length();

        String str2 = "hello world!";

        boolean equals = "Hello World!".equals(str1);  // equalse
        boolean b = str.equalsIgnoreCase(str2);

        boolean hello = str2.startsWith("Hello");

        boolean world = str2.endsWith("World");

        String str3 = str2.replace("world", "Russia");

        String latter = "Hello my dear friend";

        System.out.println(b);
        System.out.println(equals);
        System.out.println(hello);
        System.out.println(world);
        System.out.println(str3);

        String [] arr = latter.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toUpperCase() + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toLowerCase() + " ");
        }

        String str4 = latter.trim();
        System.out.println(str4);



    }
}
