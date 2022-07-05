package ui;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    private final By nameField = By.name("username");

    private final By passwordField = By.name("password");

    private final By loginButton = By.cssSelector(".btn-success");

    private final By noAccountErrorMessage = By.xpath("//*[text() = 'No account found with that username.']");

    private final By incorrectPasswordErrorMessage = By.xpath("//*[text() = 'The password you entered was not valid.']");

    private final By emptyNameFieldErrorMessage = By.xpath("//*[text() = 'Please enter username.']");

    private final By emptyPasswordFieldErrorMessage = By.xpath("//*[text() = 'Please enter your password.']");

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

    public SignInPage assertWrongPasswordErrorMessageDisplayed() {
        shouldBeDisplayed(incorrectPasswordErrorMessage);
        return this;
    }

    public SignInPage assertEmptyNameErrorMessageDisplayed() {
        shouldBeDisplayed(emptyNameFieldErrorMessage);
        return this;
    }

    public SignInPage assertEmptyPasswordErrorMessageDisplayed() {
        shouldBeDisplayed(emptyPasswordFieldErrorMessage);
        return this;
    }

    public SignInPage assertNoAccountErrorMessageDisplayed() {
        shouldBeDisplayed(noAccountErrorMessage);
        return this;
    }
}
