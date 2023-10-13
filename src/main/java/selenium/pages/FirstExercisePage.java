package selenium.pages;
import org.openqa.selenium.WebDriver;

public class FirstExercisePage extends Exercise{

    public FirstExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    public FirstExercisePage clickOnButtons(){
        for (String buttonName: getInstructionsTexts()) {
            getButton(buttonName).click();
        }
        return this;
    }
}
