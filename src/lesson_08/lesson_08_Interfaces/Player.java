package lesson_08.lesson_08_Interfaces;

public interface Player {
    void takeCard(Card card);
    int counValuesOfAllCardOnHand();
    boolean needCard();
    void showCardsOnHand();
}
