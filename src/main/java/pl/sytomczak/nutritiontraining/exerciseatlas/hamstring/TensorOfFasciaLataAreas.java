package pl.sytomczak.nutritiontraining.exerciseatlas.hamstring;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class TensorOfFasciaLataAreas extends PrintableExercise {


    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.DUMBBELL_LEG_CURL_LYING);
        exercises.add(Exercise.LEG_CURL_LYING);
        exercises.add(Exercise.LOW_CABLE_CROSSOVER_LEG_ABDUCTION_TO_THE_SIDE);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.GOOD_MORNING);
        exercises.add(Exercise.HYPER_EXTENSIONS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);

        return exercises;

    }


}
