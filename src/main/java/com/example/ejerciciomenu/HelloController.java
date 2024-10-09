package com.example.ejerciciomenu;

import javafx.event.ActionEvent;
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
    private ChoiceBox<String> genre;
    @FXML
    private TextArea description;
    @FXML
    private TextField developer;
    @FXML
    private TextField title;
    @FXML
    private Spinner<Integer> year;
    @FXML
    private Label info;
    @FXML
    private ChoiceBox<String> platform;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        year.setValueFactory( new SpinnerValueFactory.IntegerSpinnerValueFactory(1970,2024,2024,1)); // parámetros año mínimo, máximo, actual y de uno a uno

        genre.getItems().addAll("Plataformas","Acción", "Deporte");
        genre.setValue(genre.getItems().get(0));

        platform.getItems().addAll("Arcade","NES","Rpg","shooter");
        platform.setValue( platform.getItems().get(0));
    }

    @FXML
    public void salir(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void mostrarAcerca(ActionEvent actionEvent) {
        var alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acerca de Java");
        alert.setHeaderText(null);
        alert.setContentText("Realizado por Carlos Javier");
        alert.showAndWait();
    }
}