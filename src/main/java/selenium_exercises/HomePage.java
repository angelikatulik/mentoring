package selenium_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium_exercises.enums.ExerciseNumber;

public class HomePage extends Exercise<HomePage> {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getExercisesBtn(ExerciseNumber exerciseNumber){
        return fluentWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class = 'btn_exercise']/a[contains(text(), '" + exerciseNumber.getExerciseName()+ "')]"))));
    }

    public Exercise clickOnExerciseExercise(ExerciseNumber exerciseNumber){
        getExercisesBtn(exerciseNumber).click();
        return PageFactory.initElements(driver, exerciseNumber.getExerciseClass());
    }
}
