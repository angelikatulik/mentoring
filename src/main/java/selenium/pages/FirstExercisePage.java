package selenium.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstExercisePage extends Exercise{

    public FirstExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    public FirstExercisePage clickOnButtons(){
        for (String buttonName: getInstructionsTexts()) {
            Actions action = new Actions(driver);
            action.moveToElement(getButton(buttonName)).click(getButton(buttonName)).build().perform();
        }
        return this;
    }
}
