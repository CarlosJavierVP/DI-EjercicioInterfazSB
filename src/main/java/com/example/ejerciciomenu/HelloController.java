package com.example.ejerciciomenu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private Button buttonSave;
    @FXML
    private Button buttonCancel;
    @FXML
    private ChoiceBox genre;
    @FXML
    private TextArea description;
    @FXML
    private TextField developer;
    @FXML
    private TextField title;
    @FXML
    private ComboBox platform;
    @FXML
    private Spinner year;
    @FXML
    private Label info;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}