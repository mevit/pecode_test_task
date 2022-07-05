package tests;

import driver.DriverManager;
import enums.Pages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class BaseTest {
    private static final String BASE_URL = "https://www.pecodesoftware.com/";

    @BeforeEach
    void setUp() {
        DriverManager.setupDriver();
        DriverManager.driverGet(BASE_URL);
    }

    @AfterEach
    void tearDown() {
        DriverManager.closeDriver();
    }

    void goTo(Pages page) {
        DriverManager.driverGet(BASE_URL + page.getUrl());
    }
}
