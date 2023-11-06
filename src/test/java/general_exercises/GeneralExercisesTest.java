package general_exercises;

import org.junit.jupiter.api.Test;
import general_exercises.enums.ExerciseNumber;
import general_exercises.pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralExercisesTest extends BaseTest {
    private final String successMessage = "OK. Good answer";
    GeneralExercisesPage generalExercisesPage;

    @Test
    public void exercise1Test() {
        generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.FIRST);

        FirstExercisePage firstExercisePage = new FirstExercisePage(driver);
        firstExercisePage
                .clickOnButtons()
                .checkSolution();

        assertEquals(successMessage, firstExercisePage.getSolutionResult().getText());
    }

    @Test // to zadanie nie dziala bo jest na stronie bug ale jesli by buga nie bylo to by dzialalo poprawnie
    public void exercise2Test() {
        generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.SECOND);

        SecondExercisePage secondExercisePage = new SecondExercisePage(driver);
        secondExercisePage
                .typeInInput()
                .clickOnBtn()
                .checkSolution();

        assertEquals(successMessage, secondExercisePage.getSolutionResult().getText());
    }

    @Test
    public void exercise3Test() {
        generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.THIRD);

        ThirdExercisePage thirdExercisePage = new ThirdExercisePage(driver);
        thirdExercisePage
                .selectDropdownOption()
                .checkSolution();

        assertEquals(successMessage, thirdExercisePage.getSolutionResult().getText());
    }

    @Test
    public void exercise4Test() {
        generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.FOURTH);

        FourthExercisePage fourthExercisePage = new FourthExercisePage(driver);
        fourthExercisePage.checkRadioButtons()
                .checkSolution();

        assertEquals(successMessage, fourthExercisePage.getSolutionResult().getText());
    }
}
