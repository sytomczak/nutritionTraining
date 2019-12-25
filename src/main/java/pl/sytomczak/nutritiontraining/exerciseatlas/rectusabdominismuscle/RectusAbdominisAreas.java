package pl.sytomczak.nutritiontraining.exerciseatlas.rectusabdominismuscle;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class RectusAbdominisAreas implements Exerciseable {

    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.CABLE_KNEELING_CRUNCH);
        exercises.add(Exercise.CLAMSHELL_CRUNCH_WITH_A_BALL);
        exercises.add(Exercise.CRUNCH_WITH_A_BALL_BETWEEN_THE_KNEES);
        exercises.add(Exercise.CRUNCH_WITH_ONE_LEG_UP);
        exercises.add(Exercise.DUMBBELL_BALL_CRUNCH);
        exercises.add(Exercise.REVERSED_CRUNCH);
        exercises.add(Exercise.REVERSED_CRUNCH_WITH_A_TWIST_CORKSCREW);
        exercises.add(Exercise.SWISS_BALL_LEG_EXTENSION);

        return exercises;
    }


}
