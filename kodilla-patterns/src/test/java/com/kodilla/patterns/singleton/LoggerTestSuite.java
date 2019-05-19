package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void firstLogCreator() {
        Logger.getInstance().log("Warning, testing first log!");
    }

    @Test
    public void testGetLastLogOne() {
        // Given & When

        String logToTest = Logger.getInstance().getLastLog();

        // Then
        Assert.assertEquals(logToTest, "Warning, testing first log!");
    }

    @Test
    public void testGetLastLogTwo() {
        // Given & When

        Logger.getInstance().log("Log number two!");

        // Then
        Assert.assertEquals("Log number two!", Logger.getInstance().getLastLog());
    }
}
