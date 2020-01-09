package pl.sytomczak.nutritiontraining.exerciseatlas.chestmuscles;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class PectoralisMajor extends PrintableExercise {


    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.PEC_DEC);
        exercises.add(Exercise.LOW_CABLE_CROSSOVER_FLYS_EXERCISE);
        exercises.add(Exercise.INCLINE_BARBELL_PRESS);
        exercises.add(Exercise.HIGH_CABLE_CROSSOVER_FLYS_EXERCISE);
        exercises.add(Exercise.FLAT_DUMBBELL_PRESS);
        exercises.add(Exercise.FLAT_DUMBBELL_FLYES);
        exercises.add(Exercise.FLAT_BARBELL_PRESS);
        exercises.add(Exercise.FLAT_BARBELL_PRESS_NARROW_HANDS);
        exercises.add(Exercise.DECLINE_DUMBBELL_FLYES);
        exercises.add(Exercise.DIPS);

        return exercises;
    }

}
