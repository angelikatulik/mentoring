package selenium_exercises.enums;

import selenium_exercises.FirstExercisePage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import selenium_exercises.Exercise;
import selenium_exercises.SecondExercisePage;

@AllArgsConstructor
@Getter
public enum ExerciseNumber {
    FIRST("3-5-1", FirstExercisePage.class, "Find element with id"),
    SECOND("3-8-1", SecondExercisePage.class, "Interact with an alert");

    private String number;
    private Class <? extends Exercise> exerciseClass;
    private String exerciseName;
}
