package com.kodilla.testing.shape;

import org.junit.*;

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

//    @Test
//    public void testAddFigure() {
//        // Given
//        Shape square = new Square(5);
//        ShapeCollector shapeCollector = new ShapeCollector();
//        // When
//        shapeCollector.addFigure(square);
//        // Then
//        Assert.assertEquals(square, shapeCollector.getFigure(0));
//    }
//
//    @Test
//    public void testRemoveFigure() {
//        // Given
//        Shape triangle = new Triangle(10, 7);
//        ShapeCollector shapeCollector = new ShapeCollector();
//        shapeCollector.addFigure(triangle);
//        // When
//        shapeCollector.removeFigure(triangle);
//        // Then
//        Assert.assertEquals(null, shapeCollector.getFigure(0));
//    }
//
//    @Test
//    public void testGetFigure() {
//        // Given
//        ShapeCollector shapeCollector = new ShapeCollector();
//        Shape triangle = new Triangle(8, 4);
//        Shape circle = new Circle(6);
//        shapeCollector.addFigure(triangle);
//        shapeCollector.addFigure(circle);
//        // When
//        Shape expectedFigure = shapeCollector.getFigure(1);
//        // Then
//        Assert.assertEquals(circle, expectedFigure);
//    }

    @Test
    public void testShowFigures() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(7);
        Shape triangle = new Triangle(6, 6);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        // When
        String expected = triangle.getShapeName() + " " + square.getShapeName();
        // Then
        Assert.assertEquals("Triangle Square", expected);
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
