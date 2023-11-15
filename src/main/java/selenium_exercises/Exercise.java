package selenium_exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Exercise <T extends Exercise> extends BasePage{
    private List<WebElement> instructions;
    public Exercise(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> waitForInstructions() {
        instructions = fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//em")));
        return instructions;
    }

    protected List<String> getInstructionsTexts() {
        return instructions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public WebElement getSolutionResult() {
        return driver.findElement(By.xpath("//pre[@id = 'trail']/code"));
    }

    private WebElement getCheckSolutionButton(){
        return driver.findElement(By.id("solution"));
    }

    public T checkSolution() {
        getCheckSolutionButton().click();
        fluentWait.until(ExpectedConditions.textToBePresentInElement(getSolutionResult(), "OK. Good answer"));
        return (T) this;
    }
}
