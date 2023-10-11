package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstExercisePage extends Exercise{

    public FirstExercisePage(WebDriver driver) {
        super(driver);
    }

    private List<String> getButtonNumbers(){
        List<WebElement> instructions = driver.findElements(By.xpath("//td/code"));
        List<String> instructionTexts = new ArrayList<>();
        for (WebElement instruction:instructions) {
            String instructionText = instruction.getText().substring(1);
            instructionTexts.add(instructionText);
        }
        return instructionTexts.stream().limit(3).collect(Collectors.toList());
    }

    private WebElement getButton(String buttonNumber){
        return driver.findElement(By.xpath("//button[@id = 'btnButton" + buttonNumber + "']"));
    }

    public FirstExercisePage clickOnButtons(){
        for (String number:getButtonNumbers()) {
            getButton(number).click();
        }
        return this;
    }

    public FirstExercisePage clickOnCheckSolutionBtn(){
        getCheckSolutionBtn().click();
        return this;
    }
}
