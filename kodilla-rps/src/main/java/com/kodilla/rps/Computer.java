package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public int getMove() {
        Random random = new Random();
        int compMove = random.nextInt(3) + 1;
        return compMove;
    }
}
