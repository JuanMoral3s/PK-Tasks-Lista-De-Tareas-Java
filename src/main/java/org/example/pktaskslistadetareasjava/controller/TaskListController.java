package org.example.pktaskslistadetareasjava.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.example.pktaskslistadetareasjava.model.Task;
import org.example.pktaskslistadetareasjava.model.TaskList;
import org.example.pktaskslistadetareasjava.model.TaskStorage;

public class TaskListController {

    //Controles FXML
    @FXML
    private ListView<Task> taskListView;

    @FXML
    private TextField taskTitleField;

    @FXML
    private TextField taskTextField;

    //MODELO
    ObservableList<Task> taskList = FXCollections.observableArrayList();


    //Inicializar controlador
    @FXML
    public void initialize() {
        taskList.addAll(TaskStorage.loadTasks());
        taskListView.setItems(taskList);
    }


    //Agregar tarea
    @FXML
    private void addTask() {
        String title = taskTitleField.getText().trim();
        String text = taskTextField.getText().trim();
        if (!title.isEmpty()) {
            Task newTask = new Task(title, text);
            taskList.add(newTask);
            TaskStorage.saveTasks(taskList);
            taskTitleField.clear();
            taskTextField.clear();
        }
    }

    @FXML
    private void removeTask() {
        Task selected = taskListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            taskList.remove(selected);
            TaskStorage.saveTasks(taskList);
        }
    }




}
