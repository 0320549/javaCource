package lesson_08;

import lesson_08.models.CroupieBJ;
import lesson_08.models.GameBJipl;
import lesson_08.models.Playeripl;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс игру, в которой у нас происходит игра
        // 2. Создаем игроков
        // 3. Создаем крупье
        // 4. Добавтить игроков и крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        // 8. Раздавать каждому игроку по 1 карте, пока они это требуется
        // 9. Определить победителя

        // 1. Создать класс игру, в которой у нас происходит игра
        GameBJipl gameBJipl = new GameBJipl();

        // 2. Создаем игроков
        Playeripl player1 = new Playeripl();
        Playeripl player2 = new Playeripl();


        // 3. Создаем крупье

        CroupieBJ croupieBJ = new CroupieBJ();

        // 4. Добавтить игроков и крупье в игру
        gameBJipl.addPlayerInGame(player1);
        gameBJipl.addPlayerInGame(player2);
        gameBJipl.addPlayerInGame(croupieBJ);

        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        gameBJipl.giveTwoCardsOnHand();

        // 8. Раздавать каждому игроку по 1 карте, пока они это требуется
        gameBJipl.giveOneCardIfNeedToPlayer();

        // 9. Определить победителя
        gameBJipl.printWinner();

    }
}
