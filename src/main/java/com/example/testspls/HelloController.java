package com.example.testspls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Date;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Date date = new Date(System.currentTimeMillis());
        welcomeText.setText("Hello today is " + date);
    }
}