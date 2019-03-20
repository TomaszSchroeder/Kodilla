package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import java.util.List;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsMockTest {

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
    public void testOnePreview() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(25);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(4, statisticsMonitor.getUsersCount());
        Assert.assertEquals(10, statisticsMonitor.getPostsCount());
        Assert.assertEquals(25, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(2.5, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(6.25, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(2.5, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenZeroPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(25);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(4, statisticsMonitor.getUsersCount());
        Assert.assertEquals(0, statisticsMonitor.getPostsCount());
        Assert.assertEquals(25, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(0, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(6.25, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(POSITIVE_INFINITY, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenThousandPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(5, statisticsMonitor.getUsersCount());
        Assert.assertEquals(1000, statisticsMonitor.getPostsCount());
        Assert.assertEquals(1, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(200, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(0.2, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0.001, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenZeroComments() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(5, statisticsMonitor.getUsersCount());
        Assert.assertEquals(2, statisticsMonitor.getPostsCount());
        Assert.assertEquals(1000, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(0.4, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(200, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(500, statisticsMonitor.getCommentsPerPost(), 0.0);

    }

    @Test
    public void whenCommentsLessThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(400);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(5, statisticsMonitor.getUsersCount());
        Assert.assertEquals(500, statisticsMonitor.getPostsCount());
        Assert.assertEquals(400, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(100, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(80, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0.8, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenCommentsMoreThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(400);
        when(statisticsMock.commentsCount()).thenReturn(500);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(5, statisticsMonitor.getUsersCount());
        Assert.assertEquals(400, statisticsMonitor.getPostsCount());
        Assert.assertEquals(500, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(80, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(100, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(1.25, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenZeroUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(0, statisticsMonitor.getUsersCount());
        Assert.assertEquals(100, statisticsMonitor.getPostsCount());
        Assert.assertEquals(200, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(POSITIVE_INFINITY, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(POSITIVE_INFINITY, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(2, statisticsMonitor.getCommentsPerPost(), 0.0);
    }

    @Test
    public void whenHundredUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(30);

        // When
        statisticsMonitor.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(100, statisticsMonitor.getUsersCount());
        Assert.assertEquals(10, statisticsMonitor.getPostsCount());
        Assert.assertEquals(30, statisticsMonitor.getCommentsCount());
        Assert.assertEquals(0.1, statisticsMonitor.getPostsPerUser(), 0.0);
        Assert.assertEquals(0.3, statisticsMonitor.getCommentsPerUser(), 0.0);
        Assert.assertEquals(3, statisticsMonitor.getCommentsPerPost(), 0.00);
    }

}
