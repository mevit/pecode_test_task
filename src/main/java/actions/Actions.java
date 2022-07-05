package actions;

import org.openqa.selenium.By;

public interface Actions {

    void click(By by);

    void shouldBeDisplayed(By by);

    void shouldBeEnabled(By by);

    void enterText(By by, String text);

    void shouldHaveExactText(By by, String text);
}
