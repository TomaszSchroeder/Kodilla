package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice {

    Random random = new Random();
    private int chosenOption = random.nextInt(2);

    public int getChosenOption() {
        return chosenOption;
    }

    
}

