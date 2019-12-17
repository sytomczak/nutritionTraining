package pl.sytomczak.nutritiontraining.exerciseatlas.abdominalObliqueMuscle;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class ExternalObliqueAreas implements Exerciseable {


    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.SIDE_PLANK_ON_A_HAND);

        return exercises;
    }
}
