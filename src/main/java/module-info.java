module com.example.ejerciciomenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciomenu to javafx.fxml;
    exports com.example.ejerciciomenu;
}