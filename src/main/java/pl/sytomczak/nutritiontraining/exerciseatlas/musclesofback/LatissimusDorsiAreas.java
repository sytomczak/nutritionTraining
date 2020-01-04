package pl.sytomczak.nutritiontraining.exerciseatlas.musclesofback;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class LatissimusDorsiAreas extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.BENT_OVER_BARBELL_ROWS_OVERHAND);
        exercises.add(Exercise.BENT_OVER_SINGLE_DUMBBELL_ROWS);
        exercises.add(Exercise.HALF_BARBELL_ROW);
        exercises.add(Exercise.LAT_PULL_DOWN_UNDERHAND);
        exercises.add(Exercise.LOW_CABLE_LOW_ROW_SITTING_ON_A_BENCH_FRONT);
        exercises.add(Exercise.LOW_CABLE_ROW);
        exercises.add(Exercise.LYING_BARBELL_ROWS_ON_AN_INCLINE_BENCH);
        exercises.add(Exercise.PULL_UPS_ON_A_BAR_TO_THE_NECK);
        exercises.add(Exercise.REVERSED_HANDS_CHEST_PULL_UPS);
        exercises.add(Exercise.TRIANGLE_BAR_LAT_PULL_DOWN);
        exercises.add(Exercise.WIDE_GRIP_CHEST_PULL_UPS);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.GOOD_MORNING);

        return exercises;
    }
}
