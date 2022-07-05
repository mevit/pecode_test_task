package actions;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionsImpl implements Actions {
    private final WebDriver driver = DriverManager.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    @Override
    public void click(By by) {
        driver.findElement(by).click();
    }

    @Override
    public void shouldBeDisplayed(By by) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    @Override
    public void shouldBeEnabled(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    @Override
    public void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    @Override
    public void shouldHaveExactText(By by, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(by), text));
    }
}
