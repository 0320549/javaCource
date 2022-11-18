package lesson_08.homework_08;

public class Person {
    private String fullName;
    private int age;


    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person neizv = new Person();
    Person steam = new Person("Steam", 30);


    public void move() {
    }

    public void talk() {
        System.out.println(steam.getFullName() + "говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
