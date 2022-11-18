package lesson_08.homework_08;

public class User {
    private String login;
    private int password;

    Product copybook = new Product();
    User person = new User();


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
