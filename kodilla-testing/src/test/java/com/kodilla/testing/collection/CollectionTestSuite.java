package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case for Collections: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case for Collections: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite for Collections: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite for Collections: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        ArrayList<Integer> base = new ArrayList<>();
        // When
        boolean result = base.isEmpty();
        System.out.println("Testing " + result);
        // Then
        Assert.assertTrue("OK", result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        // When
        ArrayList<Integer> output = exterminator.exterminate(input);
        System.out.println("Testing " + expected);
        // Then
        Assert.assertEquals(expected, output);
    }
}