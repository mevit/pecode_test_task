package tests;

import driver.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
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
