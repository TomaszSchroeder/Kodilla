package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();

        // Then
        Assert.assertEquals(true, shopping.isTaskExecuted());
        Assert.assertEquals("Groceries shopping", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);

        // Then
        Assert.assertEquals(false, painting.isTaskExecuted());
        Assert.assertEquals("Outdoor painting", painting.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        // Given
        TaskFactory taskFactory = new TaskFactory();

        // When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        // Then
        Assert.assertEquals(false, driving.isTaskExecuted());
        Assert.assertEquals("Everyday driving", driving.getTaskName());
    }

}
