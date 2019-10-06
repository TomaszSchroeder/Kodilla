package com.kodilla.patterns2.observer.forum.homework;

import java.util.*;

public class Tasks implements TasksQueueObservable {

    private final Student student;
    private final Deque<String> courseTasks;
    private final List<MentorObserver> observers;

    public Tasks(Student student) {
        this.student = student;
        courseTasks = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        courseTasks.offerLast(task);
        notifyObserver();
    }

    @Override
    public void addObserver(MentorObserver mentorObserver) {
        observers.add(mentorObserver);
    }

    @Override
    public void notifyObserver() {
        for(MentorObserver mentorObserver : observers) {
            mentorObserver.notifyAboutNewTaskSolved(this);
        }
    }

    @Override
    public void removeObserver(MentorObserver mentorObserver) {
        observers.remove(mentorObserver);
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getCourseTasks() {
        return courseTasks;
    }
}
