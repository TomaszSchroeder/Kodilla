package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {


        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer item : numbers) {
            if (item % 2 == 0) {
                evens.add(item);
            }
        }
        return evens;
    }

}


