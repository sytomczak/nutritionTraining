package pl.sytomczak.nutritiontraining.exerciseatlas.triceps;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class TricepsAreas extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.CABLE_SKULL_CRUSHERS);
        exercises.add(Exercise.DIPS);
        exercises.add(Exercise.FLAT_BARBELL_PRESS_NARROW_HANDS);
        exercises.add(Exercise.HIGH_CABLE_CROSSOVER_CURLS_ON_CABLES);
        exercises.add(Exercise.LYING_BARBELL_FRENCH_PRESS);
        exercises.add(Exercise.LYING_ONE_ARM_DUMBBELL_FRENCH_PRESS);
        exercises.add(Exercise.LYING_TRICEP_EXTENSION_SKULL_CRUSHERS_UNDERHAND);
        exercises.add(Exercise.ONE_ARM_BENT_OVER_ROW_WITH_CABLE_CROSSOVER);
        exercises.add(Exercise.PUSHDOWNS_ON_A_CROSSOVER_MACHINE);
        exercises.add(Exercise.PUSHDOWNS_ON_A_CROSSOVER_MACHINE_UNDERHAND);
        exercises.add(Exercise.REVERSED_PUSH_UPS);
        exercises.add(Exercise.SEATED_DUMBBELL_FRENCH_PRESS);
        exercises.add(Exercise.SEATED_ONE_ARM_DUMBBELL_FRENCH_PRESS);

        return exercises;
    }


}
