package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {

        forumUsers.add(new ForumUser(66, "Admin", 'M', LocalDate.of(1970,10,20), 2541));
        forumUsers.add(new ForumUser(242, "Moderator", 'F', LocalDate.of(1988,5,11), 2342));
        forumUsers.add(new ForumUser(101, "Mietek", 'M', LocalDate.of(1995,3,11), 4562));
        forumUsers.add(new ForumUser(666, "Szatan", 'M', LocalDate.of(1981,8,15), 777));
        forumUsers.add(new ForumUser(354, "Gienia", 'F', LocalDate.of(2004,12,13), 1111));
        forumUsers.add(new ForumUser(103, "Ghost", 'M', LocalDate.of(1991,1,31), 0));
        forumUsers.add(new ForumUser(111, "Cobretti", 'M', LocalDate.of(1970,10,20), 0));
        forumUsers.add(new ForumUser(329, "XYZ", 'M', LocalDate.of(1999,3,20), 135));
        forumUsers.add(new ForumUser(129, "No-c-nick", 'F', LocalDate.of(2003,6,6), 300));
        forumUsers.add(new ForumUser(157, "Uszatek", 'M', LocalDate.of(1950,4,4), 25541));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
