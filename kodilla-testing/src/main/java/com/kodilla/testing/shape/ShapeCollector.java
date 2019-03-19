package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ShapeCollector() {
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
        return getFigure(n);
    }

    public String showFigures() {
        for (int i = 0; i < figures.size(); i++) {
            if (figures.contains(figures.get(0))) {
                return figures.get(0).getShapeName();
            }
        }
        return null;
    }
}
