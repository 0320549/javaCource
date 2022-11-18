package lesson_07;

public class Person2 implements PeolpleInterface {

    @Override
    public void run() {
        System.out.println("Трезво");
    }

    @Override
    public void jump() {
        System.out.println("Задорно");
    }

    @Override
    public void laught() {
        System.out.println("От счастья");
    }

    @Override
    public void cry() {
        System.out.println("Слезами радости");
    }

    @Override
    public void suffer() {
        System.out.println("От большого колва денег");
    }
}
