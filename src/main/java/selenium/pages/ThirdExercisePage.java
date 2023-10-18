package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ThirdExercisePage extends Exercise {

    public ThirdExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    private WebElement getDropdown() {
      return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id = 's13']")));
    }

    public ThirdExercisePage selectDropdownOption() {
        Select select = new Select(getDropdown());
        select.selectByVisibleText(getInstructionsTexts().get(0));
        return this;
    }
}
