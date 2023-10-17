package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Exercise extends BasePage {
    List<WebElement> instructions;

    public Exercise(WebDriver driver) {
        super(driver);
    }

    protected void waitForInstructions() {
        instructions = fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//td/code")));
    }

    protected String getTrialText() {
        return instructions.get(instructions.size() - 1).getText();
    }

    public void checkSolution() {
        fluentWait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElement(getSolutionResult(), getTrialText()));
        getCheckSolutionBtn().click();
        fluentWait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(getSolutionResult(), getTrialText())));
    }

    protected List<String> getInstructionsTexts() {
        return instructions.stream().limit(instructions.size()-1).map(WebElement::getText).collect(Collectors.toList());
    }

    protected WebElement getButton(String buttonName) {
        return fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), '" + buttonName + "')]")));
    }

    protected void typeInElement(WebElement element, String value) {
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    public WebElement getSolutionResult() {
        return driver.findElement(By.xpath("//pre[@id = 'trail']/code"));
    }

    private WebElement getCheckSolutionBtn() {
        return driver.findElement(By.xpath("//button[@id = 'solution']"));
    }

}
