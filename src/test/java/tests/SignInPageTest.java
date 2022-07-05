package tests;

import enums.Pages;
import org.junit.jupiter.api.Test;
import ui.SignInPage;

class SignInPageTest extends BaseTest {

    @Test
    void errorMessageIsDisplayedIfPasswordIsWrong() {
        goTo(Pages.SIGN_IN);

        new SignInPage()
                .assertPageIsDisplayed()
                .enterName("test")
                .enterPassword("password")
                .clickLogin()
                .assertWrongPasswordErrorMessageDisplayed();
    }

    @Test
    void errorMessageIsDisplayedIfNoAccountFound() {
        goTo(Pages.SIGN_IN);

        new SignInPage()
                .assertPageIsDisplayed()
                .enterName("benny")
                .enterPassword("password")
                .clickLogin()
                .assertNoAccountErrorMessageDisplayed();
    }

    @Test
    void errorMessagesAreDisplayedIfFieldsAreEmpty() {
        goTo(Pages.SIGN_IN);

        new SignInPage()
                .assertPageIsDisplayed()
                .clickLogin()
                .assertEmptyNameErrorMessageDisplayed()
                .assertEmptyPasswordErrorMessageDisplayed();
    }
}
