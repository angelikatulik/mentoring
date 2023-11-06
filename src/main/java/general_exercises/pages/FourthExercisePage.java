package general_exercises.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourthExercisePage extends Exercise {

    public FourthExercisePage(WebDriver driver) {
        super(driver);
        waitForInstructions();
    }

    private List<WebElement> waitForGroups() {
        return fluentWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class = 'six columns']")));
    }

    private List<WebElement> getGroups() {
        waitForGroups();
        List<WebElement> groups = new ArrayList<>();
        for (int i = 1; i < instructions.size(); i++) {
            groups.add(driver.findElement(By.xpath("(//div[@class = 'six columns'])[" + i + "]")));
        }
        return groups;
    }

    public FourthExercisePage checkRadioButtons() {
        for (WebElement group : getGroups()) {
            String textContent = group.getAttribute("textContent");
            List<String> texts = Arrays.stream(textContent.split("\\n")).filter(part -> (part.trim()).length() != 0).collect(Collectors.toList());
            List<WebElement> inputsByGroup = group.findElements(By.xpath("input"));
            String textToCheck = texts.stream().filter(text -> text.contains(getInstructionsTexts().get(getGroups().indexOf(group)))).findAny().get();
            inputsByGroup.get(texts.indexOf(textToCheck)-1).click();
        }
        return this;
    }
}
