package lesson_08.models;

import lesson_08.lesson_08_Interfaces.GameBJ;
import lesson_08.lesson_08_Interfaces.Player;

public class GameBJipl implements GameBJ {

    Playeripl[] playersInGames = new Playeripl[3];
    DeckOfCardImpl deckOfCard = new DeckOfCardImpl();

    @Override
    public void addPlayerInGame(Playeripl player) {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] == null) {
                playersInGames[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] != null) {
                playersInGames[i].takeCard(deckOfCard.randomCards());
                playersInGames[i].takeCard(deckOfCard.randomCards());
            }
        }
    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i < playersInGames.length; i++) {
            if (playersInGames[i] != null) {
                while (playersInGames[i].needCard()) {
                    playersInGames[i].takeCard(deckOfCard.randomCards());
                }
            }
        }

    }

    @Override
    public void printWinner() {
        // 1. Проход по всему массиву в игре и выключение всех игроков у кого больше 21
        for (Playeripl player : playersInGames) {
            if (player != null) {
                if (player.counValuesOfAllCardOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }
        // 2. Победил один игрок оставшийся в игре
        for (Playeripl pl : playersInGames) {
            if (countmPlayersInGame() == 1) {
                System.out.println("Победил игрок: " + " " + pl.getName());
            }
        }
            for (Playeripl player : playersInGames) {
                if (player != null && player.isInGame() && !player.isCroupie()) {
                    player.showCardsOnHand();
                }
        }

        // 3. Победило несколько игроков, нужно выбрать одного с лучшим значением карт на руках
        int bestValue = 0;
        for (Playeripl player : playersInGames) {
            if (player != null && player.isInGame()) {
                if (bestValue < player.counValuesOfAllCardOnHand()) {
                    bestValue = player.counValuesOfAllCardOnHand();
                }
            }
        }

    }
    public int countmPlayersInGame() {
        int countPlayers = 0;
        for (Playeripl player : playersInGames) {
            if (player != null && player.isInGame()) {
                countPlayers++;

            }
        }
        return countPlayers;
    }
}
