package com.kodilla.patterns2.observer.forum.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testTaskNotification() {
        // Given
        Tasks thomasHomework = new Tasks(new Student("Thomas"));
        Tasks arekHomework = new Tasks(new Student("Arek"));
        Tasks paulHomework = new Tasks(new Student("Paul"));
        Tasks andyHomework = new Tasks(new Student("Andy"));

        Mentor carl = new Mentor("Carl");
        Mentor greg = new Mentor("Greg");

        thomasHomework.addObserver(carl);
        arekHomework.addObserver(carl);
        paulHomework.addObserver(greg);
        andyHomework.addObserver(greg);

        // When
        thomasHomework.addTaskToQueue("Task 66.6");
        thomasHomework.addTaskToQueue("Task 10.1");
        thomasHomework.addTaskToQueue("Task 2.42");
        thomasHomework.addTaskToQueue("Task 6.6");
        thomasHomework.addTaskToQueue("Task 10.4");

        arekHomework.addTaskToQueue("Task 10.1");
        arekHomework.addTaskToQueue("Task 10.2");

        paulHomework.addTaskToQueue("Task 8.2");

        andyHomework.addTaskToQueue("Task 33.3");

        // Then
        assertEquals(7, carl.getUpdateCount());
        assertEquals(2, greg.getUpdateCount());
        assertEquals(5, thomasHomework.getCourseTasks().size());
        assertEquals(2, arekHomework.getCourseTasks().size());
        assertEquals(1, paulHomework.getCourseTasks().size());
        assertEquals(1, andyHomework.getCourseTasks().size());
    }
}