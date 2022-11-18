package lesson_05_1;

public class Contactss {
    public static void main(String[] args) {


        Contact lena = new Contact("Lena", "89876543111", "lena@mail.ru");
        Contact alex = new Contact("Alex", "89283764529");
        Contact boris = new Contact("Boris", "boron@mail.ru");
        Contact vlad = new Contact("Vlad", "89190075345", "vladlen@mail.ru");
        Contact marina = new Contact("Marina", "89538740573");
        Contact sasha = new Contact("Sasha", "89987634152", "sanya@yandex.ru");


        Phonebook phonebook = new Phonebook();
        phonebook.addContact(lena);
        phonebook.addContact(alex);
        phonebook.addContact(boris);
        phonebook.addContact(vlad);
        phonebook.addContact(marina);
        phonebook.addContact(sasha);


        phonebook.renameContact("Lena", "Elena");



        System.out.println();
    }
}