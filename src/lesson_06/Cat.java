package lesson_06;

public class Cat extends Animal {

    // Поля


    // Конструктор

     public Cat() {
     }

     public Cat(String name) {
          super(name);
     }

     public Cat(String color, String name, double age, double weight) {
          super(color, name, age, weight);
     }


     // Методы


     @Override
     public void say() {
          System.out.println("Cat said meu");
     }
}
