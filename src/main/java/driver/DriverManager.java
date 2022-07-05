package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    private DriverManager() {}

    public static void setupDriver() {
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            tlDriver.set(driver);
    }

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    public static void closeDriver() {
        tlDriver.get().close();
        tlDriver.remove();
    }

    public static void driverGet(String url) {
        tlDriver.get().get(url);
    }
}
