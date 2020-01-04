package pl.sytomczak.nutritiontraining.exerciseatlas.forearms;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class ForearmsAreas extends PrintableExercise {

    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.BARBELL_WRIST_EXTENSION);
        exercises.add(Exercise.BARBELL_WRIST_EXTENSION_UNDERHAND);
        exercises.add(Exercise.ROTATING_FOREARMS_WITH_DUMBBELLS);

        return exercises;

    }


}
