package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Groceries shopping", "Bread", 2);
            case PAINTINGTASK:
                return new PaintingTask("Outdoor painting", "Brown", "Fence");
            case DRIVINGTASK:
                return new DrivingTask("Everyday driving", "Work", "Ford Mondeo");
                default:
                    return null;
        }
    }
}
