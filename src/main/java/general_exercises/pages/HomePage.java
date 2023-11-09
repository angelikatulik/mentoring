package general_exercises.pages;

import general_exercises.enums.ExerciseNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends ExerciseAbstractPage<HomePage>{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getExerciseButton(ExerciseNumber exerciseNumber){
        WebElement exerciseBtn = driver.findElement(By.xpath("//a[contains(text(), 'Exercise " + exerciseNumber.getNumber() + "')]"));
        return fluentWait.until(ExpectedConditions.elementToBeClickable(exerciseBtn));
    }

    public ExerciseAbstractPage clickOnExercise(ExerciseNumber exerciseNumber){
        getExerciseButton(exerciseNumber).click();
        return PageFactory.initElements(driver, exerciseNumber.getExerciseClass());
    }
}
