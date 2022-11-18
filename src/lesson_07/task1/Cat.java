package lesson_07.task1;

public class Cat extends Animal {
    private boolean canmeow;

    public boolean isCanmeow() {
        return canmeow;
    }

    public void setCanmeow(boolean canmeow) {
        this.canmeow = canmeow;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
