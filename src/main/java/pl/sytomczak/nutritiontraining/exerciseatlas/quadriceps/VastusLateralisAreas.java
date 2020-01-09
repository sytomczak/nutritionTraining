package pl.sytomczak.nutritiontraining.exerciseatlas.quadriceps;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class VastusLateralisAreas extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.HACK_SQUATS);
        exercises.add(Exercise.HACK_SQUATS_WITH_BARBELL);
        exercises.add(Exercise.LEG_PRESS);
        exercises.add(Exercise.LUNGES_WITH_DUMBBELLS);
        exercises.add(Exercise.SISSY_SQUATS);
        exercises.add(Exercise.SMITH_HACK_SQUATS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);

        return exercises;
    }


}
