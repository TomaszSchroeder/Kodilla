package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public boolean addTask(String task) {
        int tasksQuantity = tasks.size();
        tasks.add(task);
        if(tasks.size() > tasksQuantity) {
            return true;
        } return false;
    }

}
