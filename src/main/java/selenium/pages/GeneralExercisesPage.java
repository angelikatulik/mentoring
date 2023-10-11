package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.enums.ExerciseNumber;

public class GeneralExercisesPage extends BasePage{

    public GeneralExercisesPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getExerciseButton(ExerciseNumber exerciseNumber){
        return driver.findElement(By.xpath("//a[contains(text(), 'Exercise " + exerciseNumber.getNumber() + "')]"));
    }

    public void clickOnExercise(ExerciseNumber exerciseNumber){
        getExerciseButton(exerciseNumber).click();
    }
}
