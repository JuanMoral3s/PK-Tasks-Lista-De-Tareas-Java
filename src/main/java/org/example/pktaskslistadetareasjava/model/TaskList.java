package org.example.pktaskslistadetareasjava.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void addTask(Task task){
        this.taskList.add(task);
    }

    public void removeTask(Task task){
        this.taskList.remove(task);
    }
}
