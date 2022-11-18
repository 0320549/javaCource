package lesson_06;

public class Animal {

    // Поля
    String color;
    String name;
    double age;
    double weight;


    //Конструкторы

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String color, String name, double age, double weight) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Методы


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void say() {
        System.out.println("Animal is talking");
    }
}
