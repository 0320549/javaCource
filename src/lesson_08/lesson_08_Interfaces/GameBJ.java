package lesson_08.lesson_08_Interfaces;

import lesson_08.models.Playeripl;

public interface GameBJ {
    void addPlayerInGame(Playeripl player); // добавить игрока в игру

    void giveTwoCardsOnHand(); // Раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // Добавить доп карту игроку, если ему нужно

    void printWinner(); // объявить победителя


}
