package pl.sytomczak.nutritiontraining.dailydemand;

import pl.sytomczak.nutritiontraining.dailydemand.intensity.*;
import pl.sytomczak.nutritiontraining.dailydemand.physique.DailyActivityLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.Physique;

public class DailyDemandCalculation {
    private int weight;
    private int height;
    private int age;

    private Physique physique;
    private Gender gender;
    private DailyActivityLevel selectedDailyActivity;

    private int numberOfStrongWorkoutsInWeek;
    private int durationOfOneStrongWorkout;

    private int numberOfAerobicWorkoutsInWeek;
    private int durationOfOneAerobicWorkout;

    private IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel;
    private IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel;

    //TODO: Ustal jaki typ powinna zwracać ta metoda  // chyba String , musi cos zwracac
    public CalculationResult calculateDailyDemand(Gender gender, int age, int weight, int height, Physique physique, DailyActivityLevel selectedDailyActivity, int numberOfAerobicWorkoutsInWeek, int durationOfOneAerobicWorkout, IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel, int numberOfStrongWorkoutsInWeek, int durationOfOneStrongWorkout, IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel) {
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.physique = physique;
        this.selectedDailyActivity = selectedDailyActivity;
        this.numberOfAerobicWorkoutsInWeek = numberOfAerobicWorkoutsInWeek;
        this.durationOfOneAerobicWorkout = durationOfOneAerobicWorkout;
        this.intensityOfAerobicWorkoutsLevel = intensityOfAerobicWorkoutsLevel;
        this.numberOfStrongWorkoutsInWeek = numberOfStrongWorkoutsInWeek;
        this.durationOfOneStrongWorkout = durationOfOneStrongWorkout;
        this.intensityOfStrongWorkoutsLevel = intensityOfStrongWorkoutsLevel;


        double bmiResult = calculateBmi();
        double demandInKcalResult = dailyDemand();
        return new CalculationResult(bmiResult, demandInKcalResult);
    }

    private double calculateDailyActivity(Physique physique) {

        double burnedKcalInDailyActivity = 0;

        switch (physique) {
            case ENDOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = -200;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = -300;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = -400;
                }
                break;
            case MESOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = -400;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = -450;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = -500;
                }
                break;
            case ECTOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = -700;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = -800;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = -900;
                }
            default:
                break;

        }
        return burnedKcalInDailyActivity;
    }

    private double calculateBurnedKcalInWorkouts(IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel, IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel) {

        double burnedKcalInExercises = 0;
        double BMR = calculateBMR();

        if (IntensityOfStrongWorkoutsLevel.LOW.equals(intensityOfStrongWorkoutsLevel)) {

            switch (intensityOfAerobicWorkoutsLevel) {
                case LOW:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR)))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc())) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        } else if (IntensityOfStrongWorkoutsLevel.MEDIUM.equals(intensityOfStrongWorkoutsLevel)) {
            switch (intensityOfAerobicWorkoutsLevel) {
                case LOW:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        } else if (IntensityOfStrongWorkoutsLevel.HIGH.equals(intensityOfStrongWorkoutsLevel)) {
            switch (intensityOfAerobicWorkoutsLevel) {
                case LOW:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = (durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts() +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts() + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        }

        return burnedKcalInExercises;
    }


    private double calculateBMR() {

        double BMR = 0;
        this.gender = Gender.MALE;

        if (gender.equals(Gender.MALE)) {
            BMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) + 5;
        } else {
            BMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) - 161;
        }

        return BMR;
    }

    private double thermalEffectOfFood() {

        double thermalEffectOfFood = 0;
        double BMR = calculateBMR();
        double TEA = calculateBurnedKcalInWorkouts(intensityOfStrongWorkoutsLevel, intensityOfAerobicWorkoutsLevel);
        double dailyActivity = calculateDailyActivity(physique);

        thermalEffectOfFood = 6 / 100 * (BMR + TEA + dailyActivity);

        return thermalEffectOfFood;
    }

    private double dailyDemand() {
        double BMR = calculateBMR();
        double TEA = calculateBurnedKcalInWorkouts(intensityOfStrongWorkoutsLevel, intensityOfAerobicWorkoutsLevel);
        double TEF = thermalEffectOfFood();
        double dailyActivity = calculateDailyActivity(physique);


        double dailyDemand = 0;

        dailyDemand = BMR + TEA + TEF + dailyActivity;

        return dailyDemand;
    }

    private double calculateBmi() {
        double bmi = 0;

        bmi = weight / ((height / 100) ^ 2);

        return bmi;
    }
}