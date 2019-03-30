package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class DemoShowingLogic {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What's Your name?");
        String playerName = scanner.nextLine();
        System.out.println("How many won games do You want to achieve victory?");
        int numberOfGames = scanner.nextInt();

        int computerPoints = 0;
        int playerPoints = 0;

        boolean end = false;


        while (end == false) {

            if (numberOfGames > playerPoints && numberOfGames > computerPoints) {

                System.out.println("Choose your option:");
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.println("X - End game");
                System.out.println("N - New Game");

                System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                byte input = scanner.nextByte();


                switch (input) {

                    case 1:
                        System.out.println("You have chosen a rock.");
                        generateMove();

                        if (generateMove() == 1 && input == 1) {
                            System.out.println("Computer has chosen a rock. It's a tie");
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 2 && input == 1) {
                            System.out.println("Computer has chosen a paper. You've lost!");
                            computerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 3 && input == 1) {
                            System.out.println("Computer has chosen a scissors. You've won!");
                            playerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        }

                        break;
                    case 2:
                        System.out.println("You have chosen a paper.");
                        generateMove();
                        if (generateMove() == 1 && input == 2) {
                            System.out.println("Computer has chosen a rock. You've won!");
                            playerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 2 && input == 2) {
                            System.out.println("Computer has chosen a paper. It's a tie!");
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 3 && input == 2) {
                            System.out.println("Computer has chosen a scissors. You've lost!");
                            computerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        }

                        break;
                    case 3:
                        System.out.println("You have chosen a scissors");
                        generateMove();
                        if (generateMove() == 1 && input == 3) {
                            System.out.println("Computer has chosen a rock. You've lost!");
                            computerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 2 && input == 3) {
                            System.out.println("Computer has chosen a paper. You've won!");
                            playerPoints++;
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        } else if (generateMove() == 3 && input == 3) {
                            System.out.println("It's a tie!");
                            System.out.println("\n" + playerName + " " + playerPoints + " : " + computerPoints + " CPU");
                        }
                        break;


                    default:
                        System.out.println("Wrong choice");
                        break;
                }
            } else end = true;
        }
        displayFinalResult(playerName, computerPoints, playerPoints);


    }

    public static void displayFinalResult(String playerName, int computerPoints, int playerPoints) {
        System.out.println("FINAL SCORE");
        System.out.println(playerName + " " + playerPoints + " : " + computerPoints + " CPU");
        if (playerPoints > computerPoints) {
            System.out.println(playerName + " WINS!!!");
        } else System.out.println("CPU WINS!!!");
        System.out.println("Thank You for playing our game!");
    }

    public static int generateMove() {

        Random random = new Random();
        int move = random.nextInt(3) + 1;


        return move;

    }


}


