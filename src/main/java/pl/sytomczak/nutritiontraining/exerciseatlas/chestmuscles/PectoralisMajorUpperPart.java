package pl.sytomczak.nutritiontraining.exerciseatlas.chestmuscles;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class PectoralisMajorUpperPart extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.SEATED_MACHINE_BENCH_PRESS);
        exercises.add(Exercise.LYING_TRICEPS_EXTENSION_SKULL_CRUSHERS);
        exercises.add(Exercise.INCLINE_DUMBBE_LL_PRESS);
        exercises.add(Exercise.INCLINE_CABLE_FLYES);
        exercises.add(Exercise.INCLINE_BARBELL_PRESS);
        exercises.add(Exercise.LAT_PULL_DOWN_UNDERHAND);
        exercises.add(Exercise.REVERSED_HANDS_CHEST_PULL_UPS);
        exercises.add(Exercise.TRIANGLE_BAR_LAT_PULL_DOWN);
        exercises.add(Exercise.WIDE_GRIP_CHEST_PULL_UPS);

        return exercises;

    }
}
