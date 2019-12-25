package pl.sytomczak.nutritiontraining.exerciseatlas.biceps;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class BicepsAreas implements Exerciseable {

    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.CURL);
        exercises.add(Exercise.DRAG_CURL);
        exercises.add(Exercise.CABLE_CROSSOVER_BICEPS_CURLS_HIGH);
        exercises.add(Exercise.CABLE_BICEPS_CURLS);
        exercises.add(Exercise.CABLE_CROSSOVER_MACHINE);
        exercises.add(Exercise.DUMBBELL_BICEPS_CURL_OVER_AN_INCLINE_BENCH_LYING_FRONT);
        exercises.add(Exercise.DUMBBELL_BICEPS_CURL_UNDERHAND);
        exercises.add(Exercise.DUMBBELL_BICEPS_HAMMER_CURL);
        exercises.add(Exercise.DUMBBELL_CONCENTRATION_BICEPS_CURLS);
        exercises.add(Exercise.LYING_CABLE_BICEPS_CURL);
        exercises.add(Exercise.PREACHER_BARBELL_BICEPS_CURLS_UNDERHAND);
        exercises.add(Exercise.SEATED_DUMBBELL_BICEP_CURL_WITH_OUTWARD_ROTATION);
        exercises.add(Exercise.SEATED_DUMBBELL_HAMMER_BICEPS_CURL);
        exercises.add(Exercise.STANDING_BICEPS_CURL_UNDERHAND);
        exercises.add(Exercise.STANDING_BICEPS_CURL_UNDERHAND_NARROW_GRIP);
        exercises.add(Exercise.STANDING_BICEPS_CURL_UNDERHAND_WIDE_GRIP);
        exercises.add(Exercise.STANDING_DUMBBELL_BICEPS_CURL_WITH_OUTWARD_ROTATION);

        return exercises;
    }
}
