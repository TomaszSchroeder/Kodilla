package com.kodilla.rps;

import static com.kodilla.rps.Game.playAgain;

public class Engine {

    public static boolean end = false;

    private Player player;
    private Computer computer;
    private int playerScore;
    private int computerScore;
    private int numberOfGames;
    private String name;

    public Engine() {
        player = new Player();
        name = player.askName();
        computer = new Computer();
        playerScore = 0;
        computerScore = 0;
        numberOfGames = player.quantityOfGames();
    }

    public void getPlayerName() {
        player.askName();
    }

    public void startGame() {

        boolean end = false;
        while (!end) {

            if (numberOfGames > playerScore && numberOfGames > computerScore) {

                int playerMove = player.getMove();
                Game.displayMove(player.getName(), playerMove);
                int computerMove = computer.getMove();
                Game.displayMove("CPU", computerMove);
                int checkResult = Game.compareMoves(playerMove, computerMove);
                switch (checkResult) {
                    case 0:
                        System.out.println("It's a draw!");
                        System.out.println("Current score: " + player.getName() + " " + playerScore + " : " + computerScore + " CPU\n");
                        break;
                    case 1:
                        System.out.println(player.getName() + " gets a point");
                        playerScore++;
                        System.out.println("Current score: " + player.getName() + " " + playerScore + " : " + computerScore + " CPU\n");
                        break;
                    case -1:
                        System.out.println("CPU gets a point");
                        computerScore++;
                        System.out.println("Current score: " + player.getName() + " " + playerScore + " : " + computerScore + " CPU\n");
                        break;
                }
                if (playerScore == numberOfGames) {
                    System.out.println("\nFINAL SCORE");
                    System.out.println(player.getName() + " " + playerScore + " : " + computerScore + " CPU");
                    System.out.println(player.getName() + " Has won the game!!!");
                    playAgain();
                }

                if (computerScore == numberOfGames) {
                    System.out.println("\nFINAL SCORE");
                    System.out.println(player.getName() + " " + playerScore + " : " + computerScore + " CPU");
                    System.out.println("CPU has won the game!!!");
                    playAgain();
                }

            }
        }
    }
}
