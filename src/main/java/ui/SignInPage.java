package ui;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    private final By nameField = By.name("username");

    private final By passwordField = By.name("password");

    private final By loginButton = By.cssSelector(".btn-success");

    private final By errorMessage = By.cssSelector(".has-error");

    public SignInPage assertPageIsDisplayed() {
        shouldBeDisplayed(nameField);
        shouldBeDisplayed(passwordField);
        shouldBeDisplayed(loginButton);
        return this;
    }

    public SignInPage enterName(String name) {
        shouldBeDisplayed(nameField);
        enterText(nameField, name);
        return this;
    }

    public SignInPage enterPassword(String password) {
        shouldBeDisplayed(passwordField);
        enterText(passwordField, password);
        return this;
    }

    public SignInPage clickLogin() {
        shouldBeEnabled(loginButton);
        click(loginButton);
        return this;
    }

    public SignInPage assertErrorMessageIsDisplayed(String message) {
        shouldBeDisplayed(errorMessage);
        shouldHaveExactText(errorMessage, message);
        return this;
    }
}
