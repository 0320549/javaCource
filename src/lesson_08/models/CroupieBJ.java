package lesson_08.models;

public class CroupieBJ extends Playeripl{

    @Override
    public boolean isCroupie() {
        return true;
    }

    @Override
    public boolean needCard() {
        return counValuesOfAllCardOnHand() <= 17;
    }


}
