package general_exercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecondExercisePage extends ExerciseAbstractPage<SecondExercisePage> {

    public SecondExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    private WebElement getInput() {
        return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = '" + getInstructionsTexts().get(1).toLowerCase().replaceAll(" ", "") +  "']")));
    }

    public SecondExercisePage typeInInput(){
        typeInElement(getInput(), getInstructionsTexts().get(0));
        return this;
    }

    public SecondExercisePage clickOnBtn(){
        getButton(getInstructionsTexts().get(2)).click();
        return this;
    }

}
