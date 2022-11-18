package lesson_06.box_with_disks;

public class DiskAudio extends Disk {

    // Поля
//    private String name; //  Название альбома
    private String singer; // Исполнитель
    //    private int year;   // год вып
    private int coutofTracks; //кол треков


    // Конструкторы


    public DiskAudio(String name, int year) {
        super(name, year);
    }


    public DiskAudio(String name, int year, String singer, int coutofTracks) {
        super(name, year);
        this.singer = singer;
        this.coutofTracks = coutofTracks;
    }

    // Методы
    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getSinger() + " " + getYear() + " " + getCoutofTracks());
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCoutofTracks() {
        return coutofTracks;
    }

    public void setCoutofTracks(int coutofTracks) {
        this.coutofTracks = coutofTracks;
    }
}
