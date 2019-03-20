package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsMonitor;


import org.junit.*;

import java.util.ArrayList;

import java.util.List;

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
        ArrayList<String> listOfusers = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            listOfusers.add("user"+i);
        }
        when(statisticsMock.usersNames()).thenReturn(listOfusers);

        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);

        ArrayList<String> listOfPosts = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            listOfPosts.add("post"+i);
        }

        int posts = listOfPosts.size();

        when(statisticsMock.postsCount()).thenReturn(posts);

        ArrayList<String> listOfComments = new ArrayList<>();
        for(int i = 0; i < 18; i++) {
            listOfComments.add("comment"+i);
        }

        int comments = listOfComments.size();

        when(statisticsMock.commentsCount()).thenReturn(comments);

        // When
        int users =  listOfusers.size();
        int numberOfPosts = posts;
        int numberOfComments = comments;

        // Then
        Assert.assertEquals("Total posts per user: 3, comments per user: 6, comments per post: 2", statisticsMonitor.calculateAdvStatistics(statisticsMock));

    }

    @Test(expected=java.lang.ArithmeticException.class)
    public void testOneNoUsers() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfusers = new ArrayList<>();
//        for(int i = 0; i < 3; i++) {
//            listOfusers.add("user"+i);
//        }
        when(statisticsMock.usersNames()).thenReturn(listOfusers);

        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);

        ArrayList<String> listOfPosts = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            listOfPosts.add("post"+i);
        }

        int posts = listOfPosts.size();

        when(statisticsMock.postsCount()).thenReturn(posts);

        ArrayList<String> listOfComments = new ArrayList<>();
        for(int i = 0; i < 18; i++) {
            listOfComments.add("comment"+i);
        }

        int comments = listOfComments.size();

        when(statisticsMock.commentsCount()).thenReturn(comments);

        // When
        int users =  listOfusers.size();
        int numberOfPosts = posts;
        int numberOfComments = comments;

        // Then
        Assert.assertEquals("Total posts per user: 0, comments per user: 0, comments per post: 2", statisticsMonitor.calculateAdvStatistics(statisticsMock));

    }
}
//
//    @Test
//    // users = 3, posts = 0, comments = 6;
//    public void testAveragesOne() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        usersList.add(1);
//        usersList.add(2);
//        usersList.add(3);
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for (int i = 0; i < 6; i++) {
//            commentsList.add(i);
//        }
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(0, postsPerUser, 0.1);
//        Assert.assertEquals(0.5, commentsPerUser, 0.1);
//        Assert.assertEquals(0, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 5, posts = 1000, comments = 10;
//    public void testAveragesTwo() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            usersList.add(i);
//        }
//
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 1000; i++) {
//            postsList.add(i);
//        }
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            commentsList.add(i);
//        }
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(200, postsPerUser, 0.1);
//        Assert.assertEquals(2, commentsPerUser, 0.1);
//        Assert.assertEquals(0.01, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 5, posts = 200, comments = 0;
//    public void testAveragesThree() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            usersList.add(i);
//        }
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            postsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(40, postsPerUser, 0.1);
//        Assert.assertEquals(0, commentsPerUser, 0.1);
//        Assert.assertEquals(0, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 5, posts = 200, comments = 50;
//    public void testAveragesFour() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            usersList.add(i);
//        }
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            postsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for(int i = 0; i < 50; i++){
//            commentsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(40, postsPerUser, 0.1);
//        Assert.assertEquals(10, commentsPerUser, 0.1);
//        Assert.assertEquals(0.25, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 5, posts = 200, comments = 400;
//    public void testAveragesFive() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        for (int i = 0; i < 5; i++) {
//            usersList.add(i);
//        }
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            postsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for(int i = 0; i < 400; i++){
//            commentsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(40, postsPerUser, 0.1);
//        Assert.assertEquals(80, commentsPerUser, 0.1);
//        Assert.assertEquals(2, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 0, posts = 200, comments = 400;
//    public void testAveragesSix() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            postsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for(int i = 0; i < 400; i++){
//            commentsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(0, postsPerUser, 0.1);
//        Assert.assertEquals(0, commentsPerUser, 0.1);
//        Assert.assertEquals(2, commentsPerPost, 0.1);
//    }
//
//    @Test
//    // users = 100, posts = 200, comments = 400;
//    public void testAveragesSeven() {
//        // Given
//        Statistics statisticsMock = mock(Statistics.class);
//        List<Integer> usersList = new ArrayList<Integer>();
//        for (int i = 0; i < 100; i++) {
//            usersList.add(i);
//        }
//        when(statisticsMock.usersNames().size()).thenReturn(usersList.size());
//
//        List<Integer> postsList = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            postsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(postsList.size());
//
//        List<Integer> commentsList = new ArrayList<Integer>();
//        for(int i = 0; i < 400; i++){
//            commentsList.add(i);
//        }
//
//        when(statisticsMock.postsCount()).thenReturn(commentsList.size());
//
//        StatisticsMonitor statisticsMonitor = new StatisticsMonitor(statisticsMock);
//
//        // When
//        double quantityOfUsers = statisticsMonitor.getTotalUsersCount();
//        double quantityOfPosts = statisticsMonitor.getTotalPostsCount();
//        double quantityOfComments = statisticsMonitor.getTotalPostsCount();
//        double postsPerUser = statisticsMonitor.getPostsPerUser();
//        double commentsPerUser = statisticsMonitor.getCommentsPerUser();
//        double commentsPerPost = statisticsMonitor.getCommentsPerPost();
//
//        //Then
//        Assert.assertEquals(2, postsPerUser, 0.1);
//        Assert.assertEquals(4, commentsPerUser, 0.1);
//        Assert.assertEquals(2, commentsPerPost, 0.1);
//    }
//
//
//}
