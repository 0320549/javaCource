package lesson_07;

public class Person1 implements PeolpleInterface {

    @Override
    public void run() {
        System.out.println("Трусцой");
    }

    @Override
    public void jump() {
        System.out.println("Впрепрыжку");
    }

    @Override
    public void laught() {
        System.out.println("Взахлеп");
    }

    @Override
    public void cry() {
        System.out.println("От счастья");
    }

    @Override
    public void suffer() {
        System.out.println("От большого колва денег");
    }
}
