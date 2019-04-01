package com.kodilla.rps;

import java.util.Scanner;

public class Player {

    private String name;

    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public String askName() {
        System.out.println("What's your name?");
        this.name = scanner.next();
        return this.name;
    }

    public int quantityOfGames() {

        int gamesToVictory;

        do {
            System.out.println("How many wins are necessary to achieve a victory?");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("It's not a positive number, try again");
            }
            gamesToVictory = scanner.nextInt();
        } while (gamesToVictory < 1);

        return gamesToVictory;

    }

    public int getMove() {
        System.out.println("Choose your option:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.println("4 - Lizard");
        System.out.println("5 - Spock");
        System.out.println("X - End game");
        System.out.println("N - New Game");

        String input = scanner.next();
        input = input.toUpperCase();
        char key = input.charAt(0);

        if (key == '1')
            return Game.rock;
        else if (key == '2')
            return Game.paper;
        else if (key == '3')
            return Game.scissors;
        else if (key == '4')
            return Game.lizard;
        else if (key == '5')
            return Game.spock;
        else if (key == 'X')
            return Game.end;
        else if (key == 'N')
            return Game.newGame;
        else {
            System.out.println("Wrong key, try again!");
            getMove();
            return 0;
        }

    }





}
