package lesson_06;

public class Dog extends Animal {
     // Поля


    // Конструктор

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String color, String name, double age, double weight) {
        super(color, name, age, weight);
    }


    // Методы


    @Override
    public void say() {
        System.out.println("Dos is barking");
    }
}
