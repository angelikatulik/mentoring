package selenium_tests;

import org.junit.jupiter.api.Test;
import selenium_exercises.FirstExercisePage;
import selenium_exercises.HomePage;
import selenium_exercises.SecondExercisePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static selenium_exercises.enums.ExerciseNumber.FIRST;
import static selenium_exercises.enums.ExerciseNumber.SECOND;

public class SeleniumTest extends BaseTest {
    private final String successMessage = "OK. Good answer";
    private String solutionResultText;
    private HomePage homePage;

    @Test
    public void findBtnAndClick() {
        homePage = new HomePage(driver);
        FirstExercisePage firstExercisePage = (FirstExercisePage) homePage.clickOnExerciseExercise(FIRST);

        solutionResultText = firstExercisePage
                .clickOnBtnWithId()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, solutionResultText);
    }

    @Test
    public void interactWithAlert() {
        homePage = new HomePage(driver);
        SecondExercisePage secondExercisePage = (SecondExercisePage) homePage.clickOnExerciseExercise(SECOND);

        solutionResultText = secondExercisePage
                .clickOnShowAlertBtn()
                .getTextAndAcceptAlert()
                .pasteTextToInput()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, solutionResultText);
    }
}
