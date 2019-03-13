package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if(result.equals("theForumUser")) {
//            System.out.println("Test OK");
//        } else {
//            System.out.println("Error!");
//        }

        System.out.println("\nTest - pierwszy test jednostkowy");

        Calculator calculator = new Calculator(10, 3);

        int resultOfAdding = calculator.add(10, 3);
        int resultOfSubstracting = calculator.substract(10,3);

        if(resultOfAdding == 13) {
            System.out.println("Calculator's adding test OK!");
        } else {
            System.out.println("Error!");
        }

        if(resultOfSubstracting == 7) {
            System.out.println("Calculator's substracting test OK!");
        } else {
            System.out.println("Error!");
        }


    }
}
