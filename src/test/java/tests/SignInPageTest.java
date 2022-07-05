package tests;

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
                .assertErrorMessageIsDisplayed("The password you entered was not valid.");
    }

    @Test
    void errorMessageIsDisplayedIfNoAccountFound() {
        goTo(Pages.SIGN_IN);

        new SignInPage()
                .assertPageIsDisplayed()
                .enterName("benny")
                .enterPassword("password")
                .clickLogin()
                .assertErrorMessageIsDisplayed("No account found with that username.");
    }

//    @Test
//    void errorMessagesAreDisplayedIfFieldsAreEmpty() {
//        goTo(Pages.SIGN_IN);
//
//        new SignInPage()
//                .assertPageIsDisplayed()
//                .clickLogin()
//                .assertErrorMessageIsDisplayed("Please enter username.")
//                .assertErrorMessageIsDisplayed("Please enter your password.");
//    }
}
