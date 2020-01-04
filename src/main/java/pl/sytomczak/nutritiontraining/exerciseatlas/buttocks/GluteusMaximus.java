package pl.sytomczak.nutritiontraining.exerciseatlas.buttocks;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.*;

public class GluteusMaximus extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.HIP_LIFTS);
        exercises.add(Exercise.HIP_LIFTS_KNEELING);
        exercises.add(Exercise.JEFFERSONS_SQUATS);
        exercises.add(Exercise.LOW_CABLE_CROSSOVER_LEG_CURL);
        exercises.add(Exercise.LUNGES_WITH_DUMBBELLS_LONG_OPTION);
        exercises.add(Exercise.STIFF_LEG_DEADLIFT);
        exercises.add(Exercise.THE_BRIDGE_WITH_BALL);
        exercises.add(Exercise.THE_BRIDGE_WITH_JOINING_THE_KNEES);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.GOOD_MORNING);
        exercises.add(Exercise.HYPER_EXTENSIONS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);

        return exercises;
    }
}
