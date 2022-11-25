package lesson_08.models;

import lesson_08.lesson_08_Interfaces.Card;
import lesson_08.lesson_08_Interfaces.Player;

import java.util.Scanner;

public class Playeripl implements Player {
    //

    Card[] cardsOnHand = new Card[100];
    boolean inGame = true;
//    boolean isCroupie = false;
    String name;

    // constructor


    // methods

    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int counValuesOfAllCardOnHand() {
        int count = 0;
        for (Card c : cardsOnHand) {
            if (c != null) {
                count = count + c.getValue();
            }
        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("----Ваши карты---");
        showCardsOnHand();
        System.out.println("Нужна ли вам еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (Card card : cardsOnHand) {
            if (card != null) {
                card.printCard();
            }
        }
    }

    @Override
    public boolean isCroupie() {
        return false;
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
