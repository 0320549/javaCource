package lesson_02.homework_03;

public class No1 {
    public static void main(String[] args) {

        int a = 13;
        int b = 24;
        int c = 20;

        if (a + b > c) {
            System.out.println("Треугольник существует");
        }
        else if ( a + c > b ) {
            System.out.println("Треугольник существует");
        }
        else if ( b + c > a )  {
            System.out.println("Треугольник существует");
        }
        else {
            System.out.println("Треугольник не существует");
        }



    }
}
