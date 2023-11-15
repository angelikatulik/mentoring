package selenium_exercises;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecondExercisePage extends Exercise<SecondExercisePage> {
    private final String windowHandle;
    private String alertText;

    public SecondExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
        windowHandle = driver.getWindowHandle();
    }

    private WebElement getShowAlertButton() {
        return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showAlert")));
    }

    private WebElement getInput() {
        return driver.findElement(By.xpath("//input[@id = 'alertText']"));
    }

    private Alert waitForAlert() {
        return fluentWait.until(ExpectedConditions.alertIsPresent());
    }

    public SecondExercisePage clickOnShowAlertBtn() {
        getShowAlertButton().click();
        return this;
    }

    public SecondExercisePage getTextAndAcceptAlert() {
        Alert alert = waitForAlert();
        alertText = alert.getText();
        alert.accept();
        driver.switchTo().window(windowHandle);
        return this;
    }

    public SecondExercisePage pasteTextToInput(){
        getInput().sendKeys(alertText);
        return this;
    }
}
