package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exercise extends BasePage{

    public Exercise(WebDriver driver) {
        super(driver);
    }

    protected WebElement getCheckSolutionBtn(){
        return driver.findElement(By.xpath("//button[@id = 'solution']"));
    }

    public WebElement getSuccessMessage(){
        return driver.findElement(By.xpath("//pre[@id = 'trail']/code"));
    }
}
