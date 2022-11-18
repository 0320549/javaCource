package lesson_08.homework_08;

public class Category {
    private String name;
    private Product [] products = new Product[3];


    Category category1 = new Category();
    Category category2 = new Category();
    Category category3 = new Category();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
