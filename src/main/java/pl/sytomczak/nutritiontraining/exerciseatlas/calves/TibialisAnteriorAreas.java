package pl.sytomczak.nutritiontraining.exerciseatlas.calves;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class TibialisAnteriorAreas extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.CALF_RAISES_ON_LEG_PRESS);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);

        return exercises;
    }
}
