package org.example.pktaskslistadetareasjava.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.example.pktaskslistadetareasjava.model.Task;
import org.example.pktaskslistadetareasjava.model.TaskList;

public class TaskListController {

    //Controles FXML
    @FXML
    private ListView<Task> taskListView;

    @FXML
    private TextField taskTitleField;

    @FXML
    private TextField taskTextField;

    //MODELO
    private TaskList taskList;

    //Inicializar controlador
    public void initialize(){
        taskList = new TaskList();
        taskListView.setItems(javafx.collections.FXCollections.observableArrayList(taskList.getTaskList()));
    }

    //Agregar tarea
    @FXML
    private void addTask(){
        String tittle = taskTitleField.getText().trim();
        String text = taskTextField.getText().trim();
        if(!tittle.isEmpty()){
            Task newTask = new Task(tittle,text);
            taskList.addTask(newTask);

            taskListView.getItems().add(newTask);

            taskTextField.clear();
            taskTitleField.clear();
        }
    }

    @FXML
    private void removeTask(){
        Task selected = taskListView.getSelectionModel().getSelectedItem();
        if(selected != null){
            taskList.removeTask(selected);
            taskListView.getItems().remove(selected);
        }
    }


}
