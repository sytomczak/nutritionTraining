package pl.sytomczak.nutritiontraining.exerciseatlas.deltoidmuscle;

import pl.sytomczak.nutritiontraining.exerciseatlas.Exercise;
import pl.sytomczak.nutritiontraining.exerciseatlas.Exerciseable;

import java.util.ArrayList;
import java.util.List;

public class DeltoidAreas implements Exerciseable {

    public List<Exercise> getExercises() {
        List<Exercise> exercises = new ArrayList<Exercise>();
        exercises.add(Exercise.ARNOLD_PRESS);
        exercises.add(Exercise.BENT_OVER_CROSSOVER_LATERAL_RAISES);
        exercises.add(Exercise.BOTH_SHOULDER_ABDUCTION_TO_THE_BACK_LYING_FRONT_ON_AN_INCLINE_BENCH);
        exercises.add(Exercise.BOTH_SHOULDER_ABDUCTION_TO_THE_BACK_WITH_TRUNK_TILTED_WITH_A_BARBELL);
        exercises.add(Exercise.BOTH_SHOULDER_ABDUCTION_TO_THE_FRONT_ON_AN_INCLINE_BENCH);
        exercises.add(Exercise.BOTH_SHOULDER_ABDUCTION_WITH_TILTED_TORSO_SITTING);
        exercises.add(Exercise.BOTH_SHOULDER_ABDUCTION_WITH_TILTED_TORSO_STANDING_WITH_THE_HEAD_ON_A_BENCH);
        exercises.add(Exercise.CABLE_FRONT_LATERAL_RAISE);
        exercises.add(Exercise.CABLE_LATERAL_RAISE_BEHIND_BACK);
        exercises.add(Exercise.HIGH_CABLE_CROSSOVER_ARM_ABDUCTION_BACKWARDS);
        exercises.add(Exercise.HIGH_CABLE_CROSSOVER_ARM_ABDUCTION_BACKWARDS_LYING_ON_A_BENCH);
        exercises.add(Exercise.HIGH_CABLE_CROSSOVER_ARM_ABDUCTION_BACKWARDS_STANDING);
        exercises.add(Exercise.FACE_PULL);
        exercises.add(Exercise.LOW_CABLE_CROSSOVER_BARBELL_UPRIGHT_ROW_STANDING);
        exercises.add(Exercise.LOW_CABLE_LATERAL_RAISES);
        exercises.add(Exercise.ONE_SHOULDER_ABDUCTION_SIDEWAYS_LYING_ON_A_SIDE_ON_AN_INCLINE_BENCH);
        exercises.add(Exercise.ONE_SHOULDER_ABDUCTION_SIDEWAYS_WITH_TILTED_TORSO);
        exercises.add(Exercise.ONE_SHOULDER_ABDUCTION_TO_THE_BACK_LYING_ON_A_SIDE_ON_AN_INCLINE_BENCH);
        exercises.add(Exercise.SEATED_BARBELL_BACK_PRESS);
        exercises.add(Exercise.SEATED_BARBELL_FRONT_PRESS);
        exercises.add(Exercise.SEATED_BARBELL_FRONT_PRESS_UNDERHANDS);
        exercises.add(Exercise.SEATED_DUMBBELL_FRONT_RAISE);
        exercises.add(Exercise.SEATED_DUMBBELL_LATERAL_RAISE);
        exercises.add(Exercise.STANDING_CABLE_FRONT_RAISE);
        exercises.add(Exercise.STANDING_DUMBBELL_FRONT_RAISE);
        exercises.add(Exercise.STANDING_DUMBBELL_LATERAL_RAISE);

        return exercises;
    }

}
