package pl.sytomczak.nutritiontraining.dailydemand;

import pl.sytomczak.nutritiontraining.dailydemand.intensity.*;
import pl.sytomczak.nutritiontraining.dailydemand.physique.DailyActivityLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.Physique;
import pl.sytomczak.nutritiontraining.dailydemand.physique.ThermalEffectOfFood;

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

    private double dailyDemand;

    public CalculationResult calculateDailyDemand() {
        double bmiResult = calculateBmi();
        int demandInKcalResult = (int) dailyDemand();
        int weight = getWeight();
        return new CalculationResult(bmiResult, demandInKcalResult, weight);

    }

    private double calculateDailyActivity(Physique physique) {

        double burnedKcalInDailyActivity = 0;

        switch (physique) {
            case ENDOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = 200;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = 300;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = 400;
                }
                break;
            case MESOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = 400;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = 450;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = 500;
                }
                break;
            case ECTOMORPH:
                if (selectedDailyActivity.equals(DailyActivityLevel.LOW)) {
                    burnedKcalInDailyActivity = 700;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.MEDIUM)) {
                    burnedKcalInDailyActivity = 800;
                } else if (selectedDailyActivity.equals(DailyActivityLevel.HIGH)) {
                    burnedKcalInDailyActivity = 900;
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
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        } else if (IntensityOfStrongWorkoutsLevel.MEDIUM.equals(intensityOfStrongWorkoutsLevel)) {
            switch (intensityOfAerobicWorkoutsLevel) {
                case LOW:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.MEDIUM.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.MEDIUM.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        } else if (IntensityOfStrongWorkoutsLevel.HIGH.equals(intensityOfStrongWorkoutsLevel)) {
            switch (intensityOfAerobicWorkoutsLevel) {
                case LOW:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
                    break;
                case MEDIUM:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
                    break;
                case HIGH:
                    burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.HIGH.getLevelOfIntensityStrongWorkouts()) +
                            (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.HIGH.getNumberOfEpoc() / 100 * BMR))) +
                            (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
                default:
                    break;
            }
        }

        return burnedKcalInExercises;
    }

    private double calculateBMR() {

        double BMR = 0;

        switch (gender) {
            case FEMALE:
                BMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) - 161;
                break;
            case MALE:
                BMR = (9.99 * weight) + (6.25 * height) - (4.92 * age) + 5;
                break;
            default:
                break;
        }

        return BMR;
    }

    private double thermalEffectOfFood() {

        double thermalEffectOfFood = 0;
        double BMR = calculateBMR();
        double TEA = calculateBurnedKcalInWorkouts(intensityOfStrongWorkoutsLevel, intensityOfAerobicWorkoutsLevel);
        double dailyActivity = calculateDailyActivity(physique);

        switch (physique) {
            case ENDOMORPH:
                thermalEffectOfFood = ThermalEffectOfFood.LOW.getNumberOfThermalEffect() * (BMR + TEA + dailyActivity);
                break;
            case MESOMORPH:
                thermalEffectOfFood = ThermalEffectOfFood.MEDIUM.getNumberOfThermalEffect() * (BMR + TEA + dailyActivity);
                break;
            case ECTOMORPH:
                thermalEffectOfFood = ThermalEffectOfFood.HIGH.getNumberOfThermalEffect() * (BMR + TEA + dailyActivity);
                break;
            default:
                break;
        }
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

        bmi = (height * 0.01);
        bmi = bmi * bmi;
        bmi = weight / bmi;

        return Math.round(bmi * 100.0) / 100.0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Physique getPhysique() {
        return physique;
    }

    public void setPhysique(Physique physique) {
        this.physique = physique;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public DailyActivityLevel getSelectedDailyActivity() {
        return selectedDailyActivity;
    }

    public void setSelectedDailyActivity(DailyActivityLevel selectedDailyActivity) {
        this.selectedDailyActivity = selectedDailyActivity;
    }

    public int getNumberOfStrongWorkoutsInWeek() {
        return numberOfStrongWorkoutsInWeek;
    }

    public void setNumberOfStrongWorkoutsInWeek(int numberOfStrongWorkoutsInWeek) {
        this.numberOfStrongWorkoutsInWeek = numberOfStrongWorkoutsInWeek;
    }

    public int getDurationOfOneStrongWorkout() {
        return durationOfOneStrongWorkout;
    }

    public void setDurationOfOneStrongWorkout(int durationOfOneStrongWorkout) {
        this.durationOfOneStrongWorkout = durationOfOneStrongWorkout;
    }

    public int getNumberOfAerobicWorkoutsInWeek() {
        return numberOfAerobicWorkoutsInWeek;
    }

    public void setNumberOfAerobicWorkoutsInWeek(int numberOfAerobicWorkoutsInWeek) {
        this.numberOfAerobicWorkoutsInWeek = numberOfAerobicWorkoutsInWeek;
    }

    public int getDurationOfOneAerobicWorkout() {
        return durationOfOneAerobicWorkout;
    }

    public void setDurationOfOneAerobicWorkout(int durationOfOneAerobicWorkout) {
        this.durationOfOneAerobicWorkout = durationOfOneAerobicWorkout;
    }

    public IntensityOfStrongWorkoutsLevel getIntensityOfStrongWorkoutsLevel() {
        return intensityOfStrongWorkoutsLevel;
    }

    public void setIntensityOfStrongWorkoutsLevel(IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel) {
        this.intensityOfStrongWorkoutsLevel = intensityOfStrongWorkoutsLevel;
    }

    public IntensityOfAerobicWorkoutsLevel getIntensityOfAerobicWorkoutsLevel() {
        return intensityOfAerobicWorkoutsLevel;
    }

    public void setIntensityOfAerobicWorkoutsLevel(IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel) {
        this.intensityOfAerobicWorkoutsLevel = intensityOfAerobicWorkoutsLevel;
    }

    public double getDailyDemand() {
        return dailyDemand;
    }

    public void setDailyDemand(double dailyDemand) {
        this.dailyDemand = dailyDemand;
    }
}