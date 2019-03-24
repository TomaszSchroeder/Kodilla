package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalDouble;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        // Given


        int[] numbers = {1, 3, 5, 7, 9, 2, 44, 666};

        // When
        double output = ArrayOperations.getAverage(numbers);
        OptionalDouble preExpected = Arrays.stream(numbers).average();
        double expected = preExpected.getAsDouble();

        // Then
        Assert.assertEquals(expected, output, 0.01);


    }
}
