package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class FourthExercisePage extends Exercise {

    public FourthExercisePage(WebDriver driver) {
        super(driver);
    }

    private FourthExercisePage waitForGroups() {
        fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class = 'six columns']")));
        return this;
    }

    private List<List<WebElement>> getRadioButtonsByGroup() {
        waitForGroups();
        List<List<WebElement>> radioButtonsGroups = new ArrayList<>();
        for (int i = 0; i > instructions.size(); i++) {
            List<WebElement> radioButtonsByGroup = driver.findElements(By.xpath("//input[@name = 's" + i + " ']"));
            radioButtonsGroups.add(radioButtonsByGroup);
        }
        return radioButtonsGroups;
    }

}
