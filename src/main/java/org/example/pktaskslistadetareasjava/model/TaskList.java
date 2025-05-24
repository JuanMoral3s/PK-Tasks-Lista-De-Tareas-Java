package org.example.pktaskslistadetareasjava.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private final ObservableList<Task> taskList;

    public TaskList() {
        List<Task> loaded = TaskStorage.loadTasks();
        taskList = FXCollections.observableArrayList(loaded);
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
