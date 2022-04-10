package br.edu.femass.sistemabiblioteca.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LivroController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}