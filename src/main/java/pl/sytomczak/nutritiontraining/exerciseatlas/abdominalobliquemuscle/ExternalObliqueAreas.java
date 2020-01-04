package pl.sytomczak.nutritiontraining.exerciseatlas.abdominalobliquemuscle;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.PrintableExercise;

import java.util.ArrayList;
import java.util.List;

public class ExternalObliqueAreas extends PrintableExercise {


    public List<Exercise> getExerciseList() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.SIDE_PLANK_ON_A_HAND);
        exercises.add(Exercise.DEADLIFT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_IN_FRONT);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_SHOULDERS);
        exercises.add(Exercise.SQUATS_WITH_A_BARBELL_ON_THE_NAPE);
        exercises.add(Exercise.STEP_WITH_A_BARBELL);
        exercises.add(Exercise.DUMBBELLS);
        exercises.add(Exercise.HANGING_LEG_TWIST);
        exercises.add(Exercise.REVERSE_CRUNCH_TWISTS_WITH_STRAIGHT_LEGS);
        exercises.add(Exercise.RUSSIAN_TWISTS);
        exercises.add(Exercise.SEATED_WAIST_TWIST_WITH_A_WEIGHT);
        exercises.add(Exercise.SHIFTING_LEGS_FROM_SIDE_TO_SIDE_LYING_BACKWARDS_WITH_A_BODY_BALL);
        exercises.add(Exercise.SIDE_CRUNCH_WITH_A_BARBELL);

        return exercises;
    }
}
