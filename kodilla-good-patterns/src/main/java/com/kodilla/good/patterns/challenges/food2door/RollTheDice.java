package com.kodilla.good.patterns.challenges.food2door;

import java.util.Random;

public class RollTheDice {

    Random dice = new Random();
    int count = dice.nextInt(2);

    public RollTheDice() {
        this.dice = dice;
        this.count = count;
    }


    public boolean trueOrFalse() {
        if(count == 1) {
            return true;
        } else return false;
    }
}
