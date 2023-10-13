package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.enums.ExerciseNumber;

public class GeneralExercisesPage extends BasePage{

    public GeneralExercisesPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getExerciseButton(ExerciseNumber exerciseNumber){
        WebElement exerciseBtn = driver.findElement(By.xpath("//a[contains(text(), 'Exercise " + exerciseNumber.getNumber() + "')]"));
        fluentWait.until(ExpectedConditions.elementToBeClickable(exerciseBtn));
        return exerciseBtn;
    }

    public void clickOnExercise(ExerciseNumber exerciseNumber){
        getExerciseButton(exerciseNumber).click();
    }

}
