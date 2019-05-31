package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        // When
        String taskOne = "Some com.kodilla.hibernate.task to do ASAP";
        String taskTwo = "I'm doing this com.kodilla.hibernate.task right now";
        String taskThree = "Done it!";

        board.getToDoList().addTask(taskOne);
        board.getInProgressList().addTask(taskTwo);
        board.getDoneList().addTask(taskThree);

        // Then
        Assert.assertEquals("Some com.kodilla.hibernate.task to do ASAP", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("I'm doing this com.kodilla.hibernate.task right now", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done it!", board.getDoneList().getTasks().get(0));
        Assert.assertTrue(board.getToDoList().addTask(taskOne));
        Assert.assertTrue(board.getInProgressList().addTask(taskTwo));
        Assert.assertTrue(board.getDoneList().addTask(taskThree));

    }
}
