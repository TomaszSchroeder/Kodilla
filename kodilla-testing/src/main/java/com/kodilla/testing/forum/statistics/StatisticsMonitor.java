package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StatisticsMonitor {

    Statistics statistics;

    private double totalUsersCount;
    private double totalPostsCount;
    private double totalCommentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public StatisticsMonitor(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getTotalUsersCount() {
        return totalUsersCount;
    }

    public double getTotalPostsCount() {
        return totalPostsCount;
    }

    public double getTotalCommentsCount() {
        return totalCommentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public ArrayList<Double> calculateAdvStatistics (Statistics statistics) {
        ArrayList<Double> values = new ArrayList<Double>();

        double totalUsersCount = statistics.usersNames().size();
        double totalPostsCount = statistics.postsCount();
        double totalCommentsCount = statistics.commentsCount();

        double postsPerUser = statistics.postsCount() / statistics.usersNames().size();
        double commentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        double commentsPerPost = statistics.commentsCount() / statistics.postsCount();

        values.add(totalUsersCount);
        values.add(totalPostsCount);
        values.add(totalCommentsCount);
        values.add(postsPerUser);
        values.add(commentsPerUser);
        values.add(commentsPerPost);

        return values;
    }

    public HashMap<String, Double> showStatistics() {

        HashMap<String, Double> theResults = new HashMap<String, Double>();
        theResults.put("Total users count: ", totalUsersCount);
        theResults.put("Total posts count: ", totalPostsCount);
        theResults.put("Total comments count: ", totalCommentsCount);
        theResults.put("Average posts per user count: ", postsPerUser );
        theResults.put("Average comments per user count: ", commentsPerUser);
        theResults.put("Average comments per post count: ", commentsPerPost);

        return theResults;
    }

}
