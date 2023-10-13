package selenium_exercises;

import org.junit.jupiter.api.Test;
import selenium.enums.ExerciseNumber;
import selenium.pages.FirstExercisePage;
import selenium.pages.GeneralExercisesPage;
import selenium.pages.SecondExercisePage;
import selenium.pages.ThirdExercisePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralExercisesTest extends BaseTest {

    @Test
    public void exercise1Test() {
        GeneralExercisesPage generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.FIRST);

        FirstExercisePage firstExercisePage = new FirstExercisePage(driver);
        firstExercisePage
                .clickOnButtons()
                .checkSolution();

        assertEquals(firstExercisePage.getSolutionResult().getText(), "OK. Good answer");
    }

    @Test // to zadanie nie dziala bo jest na stronie bug ale jesli by buga nie bylo to by dzialalo poprawnie
    public void exercise2Test() {
        GeneralExercisesPage generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.SECOND);

        SecondExercisePage secondExercisePage = new SecondExercisePage(driver);
        secondExercisePage
                .typeInInput()
                .clickOnBtn()
                .checkSolution();;

        assertEquals("OK. Good answer", secondExercisePage.getSolutionResult().getText());
    }

    @Test
    public void exercise3Test() {
        GeneralExercisesPage generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.THIRD);

        ThirdExercisePage thirdExercisePage = new ThirdExercisePage(driver);
        thirdExercisePage
                .selectDropdownOption()
                .checkSolution();

        assertEquals("OK. Good answer", thirdExercisePage.getSolutionResult().getText());
    }

    @Test
    public void exercise4Test() {
        GeneralExercisesPage generalExercisesPage = new GeneralExercisesPage(driver);
        generalExercisesPage.clickOnExercise(ExerciseNumber.THIRD);

        ThirdExercisePage thirdExercisePage = new ThirdExercisePage(driver);
        thirdExercisePage
                .selectDropdownOption()
                .checkSolution();

        assertEquals("OK. Good answer", thirdExercisePage.getSolutionResult().getText());
    }
}
