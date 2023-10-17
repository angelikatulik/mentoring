package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class FirstExercisePage extends Exercise{

    public FirstExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    public FirstExercisePage clickOnButtons(){
        String expectedTrialText = "";
        for (String buttonName: getInstructionsTexts()) {
            Actions action = new Actions(driver);
            action.moveToElement(getButton(buttonName)).click(getButton(buttonName)).build().perform();
            expectedTrialText = expectedTrialText + buttonName.toLowerCase();
            fluentWait.withTimeout(Duration.ofSeconds(10)).until(ExpectedConditions.textToBe(By.xpath("//pre[@id = 'trail']/code"), expectedTrialText));
        }
        return this;
    }
}
