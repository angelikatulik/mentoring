package selenium_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstExercisePage extends Exercise<FirstExercisePage> {
    public FirstExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    public FirstExercisePage clickOnBtnWithId() {
        driver.findElement(By.id(getInstructionsTexts().get(0))).click();
        return this;
    }
}
