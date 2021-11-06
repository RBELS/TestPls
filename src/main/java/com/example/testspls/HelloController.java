package com.example.testspls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Date;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void onHelloButtonClick() {
        welcomeText.setText("Hello today is " + getDate());
    }

    public String getDate() {
        return new Date(System.currentTimeMillis()).toString();
    }
}