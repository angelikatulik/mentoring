package general_exercises;

import org.junit.jupiter.api.Test;
import general_exercises.enums.ExerciseNumber;
import general_exercises.pages.*;

import static general_exercises.enums.ExerciseNumber.FIRST;
import static general_exercises.enums.ExerciseNumber.THIRD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralExercisesTest extends BaseTest {
    private final String successMessage = "OK. Good answer";
    private HomePage homePage;
    private String solutionResultText;

    @Test
    public void exercise1Test() {
        homePage = new HomePage(driver);
        FirstExercisePage firstExercisePage = (FirstExercisePage) homePage.clickOnExercise(FIRST);

        solutionResultText = firstExercisePage
                .clickOnButtons()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, homePage.getSolutionResult().getText());
    }

    @Test
    public void exercise2Test() {
        homePage = new HomePage(driver);
        SecondExercisePage secondExercisePage = (SecondExercisePage) homePage.clickOnExercise(ExerciseNumber.SECOND);

        solutionResultText = secondExercisePage
                .typeInInput()
                .clickOnBtn()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, solutionResultText);
    }

    @Test
    public void exercise3Test() {
        homePage = new HomePage(driver);
        ThirdExercisePage thirdExercisePage = (ThirdExercisePage)  homePage.clickOnExercise(THIRD);

        solutionResultText = thirdExercisePage
                .selectDropdownOption()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, solutionResultText);
    }

    @Test
    public void exercise4Test() {
        homePage = new HomePage(driver);
        FourthExercisePage fourthExercisePage = (FourthExercisePage) homePage.clickOnExercise(ExerciseNumber.FOURTH);

        solutionResultText = fourthExercisePage
                .checkRadioButtons()
                .checkSolution()
                .getSolutionResult().getText();

        assertEquals(successMessage, solutionResultText);
    }
}
