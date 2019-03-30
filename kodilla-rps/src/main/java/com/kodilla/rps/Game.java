package com.kodilla.rps;

import static com.kodilla.rps.RpsRunner.playAgain;

public class Game {

    public static final int rock = 1;
    public static final int paper = 2;
    public static final int scissors = 3;
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
                return (cpu == scissors ? 1 : -1);
            case paper:
                return (cpu == rock ? 1 : -1);
            case scissors:
                return (cpu == paper ? 1 : -1);
        }
        return 0;
    }


}
