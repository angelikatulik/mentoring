package general_exercises.enums;

import general_exercises.pages.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExerciseNumber {
    FIRST("1", FirstExercisePage.class),
    SECOND("2", SecondExercisePage.class),
    THIRD("3", ThirdExercisePage.class),
    FOURTH("4", FourthExercisePage.class);

    private final String number;
    private final Class<? extends ExerciseAbstractPage> exerciseClass;
}
