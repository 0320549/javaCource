package lesson_05_1;

import javax.xml.namespace.QName;

public class Phonebook {

    // Поля

    private Contact[] contacts = new Contact[5];
    String name;

    // Конструктор


    // Методы

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }

        }
    }

    public Contact search(Contact contact) {

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println(contact.getName());
            }
        }
        return contact;

    }

    public void renameContact(String original, String renamed) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equalsIgnoreCase(original))
                    contacts[i].setName(renamed);
            }
            break;

        }
    }

    public void delContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name))
                contacts[i] = null;
            break;
        }
    }


}
