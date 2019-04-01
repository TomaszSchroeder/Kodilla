package com.kodilla.rps;

import java.util.Scanner;



public class Game {

    public static final int rock = 1;
    public static final int paper = 2;
    public static final int scissors = 3;
    public static final int lizard = 4;
    public static final int spock = 5;
    public static final char end = 'X';
    public static final char newGame = 'N';

    public static void displayMove(String gamer, int move) {
        switch (move) {
            case Game.rock:
                System.out.println(gamer + " has selected rock");
                break;
            case Game.paper:
                System.out.println(gamer + " has selected paper");
                break;
            case Game.scissors:
                System.out.println(gamer + " has selected scissors");
                break;
            case Game.lizard:
                System.out.println(gamer + " has selected lizard");
                break;
            case Game.spock:
                System.out.println(gamer + " has selected spock");
                break;
            case Game.end:
                System.out.println("I'm so sorry that you don't like my game, please come back soon!");
                System.exit(-1);
            case Game.newGame:

                playAgain();


            default:
                break;
        }
    }

    public static int compareMoves(int human, int cpu) {
        if (human == cpu)
            return 0;
        switch (human) {
            case rock:
                if(cpu == scissors || cpu == lizard) {
                    return 1;
                } else return -1;
            case paper:
                if(cpu == rock || cpu == spock) {
                    return 1;
                } else return -1;
            case scissors:
                if(cpu == paper || cpu == lizard) {
                    return 1;
                } else return -1;
            case lizard:
                if(cpu == spock || cpu == paper ) {
                    return 1;
                } else return -1;
            case spock:
                if (cpu == scissors || cpu == rock) {
                    return 1;
                } else return -1;
        }
        return 0;
    }

    public static void playAgain() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Do you want to play again?");
        String decision = scanner.next();
        decision = decision.toUpperCase();
        char key = decision.charAt(0);
        if (key == 'Y') {
            Engine theGame = new Engine();
            player.askName();
            theGame.startGame();
        } else if (key == 'N') {
            System.out.println("Thank you for playing with me!");
            System.exit(-1);
        } else
            System.out.println("Wrong key, try again\n");
        playAgain();

    }


}
