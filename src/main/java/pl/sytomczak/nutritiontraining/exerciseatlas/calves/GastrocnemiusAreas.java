package pl.sytomczak.nutritiontraining.exerciseatlas.calves;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class GastrocnemiusAreas implements Exerciseable {

    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.SEATED_CALF_RAISES);
        exercises.add(Exercise.DONKEY_CALF_RAISES);
        exercises.add(Exercise.STANDING_ONE_LEG_CALF_RAISE);
        exercises.add(Exercise.STANDING_CALF_RAISES);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);

        return exercises;
    }
}
