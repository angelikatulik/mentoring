package selenium_exercises;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.enums.ExerciseNumber;
import selenium.pages.FirstExercisePage;
import selenium.pages.GeneralExercisesPage;

public class GeneralExercisesTest extends BaseTest {

    @Test
    public void exercise1Test() {
        GeneralExercisesPage generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.FIRST);

        FirstExercisePage firstExercisePage = new FirstExercisePage(driver);
        firstExercisePage
                .clickOnButtons()
                .clickOnCheckSolutionBtn();

        fluentWait.until(ExpectedConditions.textToBePresentInElement(firstExercisePage.getSuccessMessage(), "OK. Good answer"));
    }
}
