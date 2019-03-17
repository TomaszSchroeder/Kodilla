package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    Shape shape;
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector() {

    }

    public Shape getShape() {
        return shape;
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        if (figures.contains(shape)) {
            figures.remove(shape);
        }
    }

    public Shape getFigure(int n) {
        figures.get(n);
        return shape;
    }

    public String showFigures() {
        if (figures.contains(shape)) {
            return shape.getShapeName();
        } else return null;
    }

}
