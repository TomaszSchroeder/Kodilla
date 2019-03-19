package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        // albo jeszcze prościej, bez tworzenia zmiennej codeToExecute
        processor.execute(() -> System.out.println("Another example text."));

        System.out.println("Calculatin expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("That's how text beautifier works:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("I am becoming bigger now!", (textToDecorate -> textToDecorate.toUpperCase()));
        poemBeautifier.beautify("Trututututu!", textToDecorate -> textToDecorate.replace('u', 'ó'));
        poemBeautifier.beautify("Another lambda", textToDecorate -> "ABC".concat(textToDecorate.concat("ABC")));
        poemBeautifier.beautify("The last one to beautify", textToDecorate -> textToDecorate.substring(4,12));

    }
}
