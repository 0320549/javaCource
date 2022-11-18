package lesson_06;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat neisv = new Cat();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik", "Black", 6,5.6);
        Cat snegok = new Cat("Snegok", "Blue",7, 8.3);

        System.out.println(barsik.getName() + " " + snegok.getName());
        snegok.setAge(8);

        neisv.setName("Kot");
        neisv.setAge(3);
        neisv.setWeight(7);
        neisv.setColor("Blue");

        System.out.println();


        Dog sfarik = new Dog ("Sharik");
        animal.say();
        snegok.say();
        sfarik.say();

    }
}
