package selenium_exercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    private static final String mainUrl = "https://antycaptcha.amberteam.pl/general_exercises/";
    protected FluentWait<WebDriver> fluentWait;

    @BeforeEach
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(mainUrl);
        fluentWait = new FluentWait<>(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
