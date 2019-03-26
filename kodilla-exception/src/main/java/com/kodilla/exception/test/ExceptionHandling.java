package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(1.4, 1.5);

        } catch (Exception e) {

            System.out.println("Oh no, completely wrong data!");

        } finally {

            System.out.println("This is the end. Quit or try again!");
        }


    }
}




