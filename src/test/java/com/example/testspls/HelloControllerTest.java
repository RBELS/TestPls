package com.example.testspls;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    HelloController controller;
    @BeforeEach
    void setUp() {
        controller = new HelloController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void onHelloButtonClick() {
    }

    @Test
    void getDate() {
        assertNotEquals(controller.getDate(), "");
    }
}