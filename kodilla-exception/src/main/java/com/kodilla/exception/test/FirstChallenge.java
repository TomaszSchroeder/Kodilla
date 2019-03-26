package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        try {

            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Be a hero and don't divide by zero");

        } finally {
            System.out.println("Try again, but remember what I told you :)");
        }



    }
}