package lesson_07.task1;

public class Horse extends Animal {
    private boolean canjump;

    public boolean isCanjump() {
        return canjump;
    }

    public void setCanjump(boolean canjump) {
        this.canjump = canjump;
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
