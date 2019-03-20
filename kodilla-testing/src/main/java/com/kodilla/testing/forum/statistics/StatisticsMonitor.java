package com.kodilla.testing.forum.statistics;

public class StatisticsMonitor {

    Statistics statistics;

    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public Double getPostsPerUser() {
        return (double) statistics.postsCount() / statistics.usersNames().size();
    }

    public Double getCommentsPerUser() {
        return (double) statistics.commentsCount() / statistics.usersNames().size();
    }

    public Double getCommentsPerPost() {
        return (double) statistics.commentsCount() / statistics.postsCount();
    }

    public int getUsersCount() {
        return statistics.usersNames().size();
    }

    public int getPostsCount() {
        return statistics.postsCount();

    }

    public int getCommentsCount() {
        return statistics.commentsCount();
    }

    public StatisticsMonitor(Statistics statistics) {
        this.statistics = statistics;

    }

    public void calculateAdvStatistics(Statistics statistics) {
        int usersCount = statistics.usersNames().size();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();

        postsPerUser = (double) statistics.postsCount() / statistics.usersNames().size();
        commentsPerUser = (double) statistics.commentsCount() / statistics.usersNames().size();
        commentsPerPost = (double) statistics.commentsCount() / statistics.postsCount();
    }

}
