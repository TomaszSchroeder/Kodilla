package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StatisticsMonitor {

    Statistics statistics;

//    private int totalUsersCount;
//    private int totalPostsCount;
//    private int totalCommentsCount;
//    private int postsPerUser;
//    private int commentsPerUser;
//    private int commentsPerPost;

    public StatisticsMonitor(Statistics statistics) {
        this.statistics = statistics;
    }

    public String calculateAdvStatistics (Statistics statistics) {
        int postsPerUser = statistics.postsCount() / statistics.usersNames().size();
        int commentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        int commentsPerPost = statistics.commentsCount() / statistics.postsCount();

        //String result = "Total posts per user: " + postsPerUser + ", comments per user: " + commentsPerUser + ", comments per post: " + commentsPerPost;
        String result = "Total posts per user: " + postsPerUser + ", comments per user: " + commentsPerUser + ", comments per post: " + commentsPerPost;
        System.out.println(result);
        return result;

    }



//    public ArrayList<Double> calculateAdvStatistics (Statistics statistics) {
//        ArrayList<Double> values = new ArrayList<Double>();
//
//        double totalUsersCount = statistics.usersNames().size();
//        double totalPostsCount = statistics.postsCount();
//        double totalCommentsCount = statistics.commentsCount();
//
//        double postsPerUser = statistics.postsCount() / statistics.usersNames().size();
//        double commentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
//        double commentsPerPost = statistics.commentsCount() / statistics.postsCount();
//
//        values.add(totalUsersCount);
//        values.add(totalPostsCount);
//        values.add(totalCommentsCount);
//        values.add(postsPerUser);
//        values.add(commentsPerUser);
//        values.add(commentsPerPost);
//
//        return values;
//    }
//
//    public HashMap<String, Double> showStatistics() {
//
//        HashMap<String, Double> theResults = new HashMap<String, Double>();
//        theResults.put("Total users count: ", totalUsersCount);
//        theResults.put("Total posts count: ", totalPostsCount);
//        theResults.put("Total comments count: ", totalCommentsCount);
//        theResults.put("Average posts per user count: ", postsPerUser );
//        theResults.put("Average comments per user count: ", commentsPerUser);
//        theResults.put("Average comments per post count: ", commentsPerPost);
//
//        return theResults;
//    }

}
