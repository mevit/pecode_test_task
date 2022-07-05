package tests;

import enums.Pages;
import org.junit.jupiter.api.Test;
import ui.SignInPage;

class GreetPageTest extends BaseTest{

    @Test
    void userCanNotOpenGreetPageWithoutLogin() {
        goTo(Pages.GREET);

        new SignInPage()
                .assertPageIsDisplayed();
    }
}
