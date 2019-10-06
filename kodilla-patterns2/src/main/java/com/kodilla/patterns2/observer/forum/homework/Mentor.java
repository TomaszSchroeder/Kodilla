package com.kodilla.patterns2.observer.forum.homework;

public class Mentor implements MentorObserver {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTaskSolved(Tasks tasks) {
        System.out.println("Hello " + name + ", your student " + tasks.getStudent().getName() + " has sent you his solution of task " + tasks.getCourseTasks().peekLast() +
                ". Total amount of tasks solved by " + tasks.getStudent().getName() + ": " + tasks.getCourseTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
