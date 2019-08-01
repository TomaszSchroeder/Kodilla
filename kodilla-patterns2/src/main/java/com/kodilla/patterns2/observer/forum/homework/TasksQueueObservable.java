package com.kodilla.patterns2.observer.forum.homework;

public interface TasksQueueObservable {

    void addObserver(MentorObserver mentorObserver);
    void notifyObserver();
    void removeObserver(MentorObserver mentorObserver);
}
