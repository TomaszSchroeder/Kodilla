package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        RpsRunner theGame = new RpsRunner();
        theGame.getPlayerName();
        theGame.startGame();

    }

    public static boolean end = false;

    private Player player;
    private Computer computer;
    private int playerScore;
    private int computerScore;
    private int numberOfGames;

    public RpsRunner() {
        player = new Player();
        computer = new Computer();
        playerScore = 0;
        computerScore = 0;
        numberOfGames = player.quantityOfGames();
    }

    public void startGame() {
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

    public void getPlayerName() {
        player.askName();
    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play again?");
        String decision = scanner.next();
        decision = decision.toUpperCase();
        char key = decision.charAt(0);
        if (key == 'Y') {
            RpsRunner theGame = new RpsRunner();
            theGame.getPlayerName();
            theGame.startGame();
        } else if (key == 'N') {
            System.out.println("Thank you for playing with me!");
            System.exit(-1);
        } else
            System.out.println("Wrong key, try again\n");
        playAgain();

    }
}
