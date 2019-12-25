package pl.sytomczak.nutritiontraining.exerciseatlas.musclesofback;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class ErectorSpinaeAreas implements Exerciseable {

    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.LOW_CABLE_ROW);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.GOOD_MORNING);
        exercises.add(Exercise.HYPER_EXTENSIONS);
        exercises.add(Exercise.BACK_STRENGTHENING_ON_ALL_FOURS);

        return exercises;

    }

}
