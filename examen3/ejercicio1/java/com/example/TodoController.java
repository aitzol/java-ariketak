package com.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class TodoController {

    @FXML
    private TextField newTaskTextField;

    @FXML
    private ListView<Task> taskListView;

    private ObservableList<Task> tasks;

    @FXML
    public void initialize() {
        tasks = FXCollections.observableArrayList();
        taskListView.setItems(tasks);

        taskListView.setCellFactory(lv -> new ListCell<Task>() {
            private final HBox hbox = new HBox(10);
            private final CheckBox checkBox = new CheckBox();
            private final Label label = new Label();
           
            {
           
                hbox.getChildren().addAll(checkBox, label);               
                checkBox.setOnAction(event -> {
                        getItem().setCompleted(checkBox.isSelected());
                });
            }
        });
    }

    @FXML
    private void addTask() {
        String taskDescription = newTaskTextField.getText().trim();
        if (!taskDescription.isEmpty()) {
            tasks.add(new Task(taskDescription));
            newTaskTextField.clear();
        }
    }
}