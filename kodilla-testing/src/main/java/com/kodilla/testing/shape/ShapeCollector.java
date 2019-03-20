package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();


    public void addFigure(Shape shape) {

        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
            return figures.remove(shape);
        }


    public Shape getFigure(int n) {
        return figures.get(n);
        }

    public String showFigures() {
        String allShapes="";
        for(Shape figure : figures) {
            allShapes += figure.getShapeName()+": " + figure.getField() + "\n";
        }
        return allShapes;
    }


}
