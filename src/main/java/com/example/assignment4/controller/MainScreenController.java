package com.example.assignment4.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}