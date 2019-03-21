package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        // Given
        Shape square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();

        // When
        shapeCollector.addFigure(square);

        // Then
        Assert.assertEquals(square, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        // Given
        Shape triangle = new Triangle(10, 7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        // When
        boolean output = shapeCollector.removeFigure(triangle);
        shapeCollector.addFigure(triangle);
        // Then
        Assert.assertTrue(output);
    }

    @Test
    public void testGetFigure() {
        // Given

        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(8, 4);
        Shape circle = new Circle(6);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        // When

        // Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(0) );
        Assert.assertEquals(circle, shapeCollector.getFigure(1));
    }

    @Test
    public void testShowFigures() {
        // Given

        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(7);
        Shape triangle = new Triangle(6, 6);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        // When
        String expected = "Square: 49.0\n" + "Triangle: 18.0\n";
        String output = shapeCollector.showFigures();

        // Then
        Assert.assertEquals(expected, output);
    }

    @Test
    public void checkField() {
        // Given
        Shape square = new Square(5);
        // When
        double output = square.getField();
        double expected = 25;
        // Then
        Assert.assertEquals(output, expected, 0.1);
    }
}
