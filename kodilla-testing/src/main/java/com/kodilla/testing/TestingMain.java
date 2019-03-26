package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
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

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4));
//        input.add(1);
//        input.add(2);
//        input.add(3);
//        input.add(4);
        //exterminator.exterminate(input);
        //ArrayList<Integer> expected = new ArrayList<>(input);

//        expected.add(2);
//        expected.add(4);
        // When
        ArrayList<Integer> output = exterminator.exterminate(input);
        System.out.println(output);


    }
}
