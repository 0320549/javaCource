package lesson_06.box_with_disks;

public class DiskVideo extends Disk {
    // Поля
//    private String name; // назв фильма
//    private int year;  // год вып
    private String studio;  // студия издатель
    private String director;  // режисер
    private int longTeam;  // продолжительность  фильма


    // Конструкторы

    public DiskVideo(String name, int year) {
        super(name, year);
    }


    public DiskVideo(String name, int year, String studio, String director, int longTeam) {
        super(name, year);
        this.studio = studio;
        this.director = director;
        this.longTeam = longTeam;
    }

    // методы
    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getYear() + " " + getDirector() + " " + getStudio() + " " + getLongTeam());
    }


    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongTeam() {
        return longTeam;
    }

    public void setLongTeam(int longTeam) {
        this.longTeam = longTeam;
    }
}
