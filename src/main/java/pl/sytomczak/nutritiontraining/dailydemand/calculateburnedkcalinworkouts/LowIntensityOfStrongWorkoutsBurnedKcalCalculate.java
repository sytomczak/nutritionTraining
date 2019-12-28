//package pl.sytomczak.nutritiontraining.dailydemand.calculateburnedkcalinworkouts;
//
//import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;
//import pl.sytomczak.nutritiontraining.dailydemand.intensity.EpocInAerobicWorkouts;
//import pl.sytomczak.nutritiontraining.dailydemand.intensity.EpocInStrongWorkouts;
//import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfAerobicWorkoutsLevel;
//import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfStrongWorkoutsLevel;
//
//public class LowIntensityOfStrongWorkoutsBurnedKcalCalculate extends DailyDemandCalculation implements CalculateBurnedKcalInWorkouts {
//
//    public double calculateBurnedKcalInWorkouts(IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel, IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel) {
//
//        double burnedKcalInExercises = 0;
//        double BMR = calculateBMR();
//
//
//        switch (intensityOfAerobicWorkoutsLevel) {
//            case LOW:
//                burnedKcalInExercises = ((getDurationOfOneStrongWorkout() * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
//                        (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
//                        (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.LOW.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.LOW.getNumberOfEpoc()))) / 7;
//                break;
//            case MEDIUM:
//                burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
//                        (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
//                        (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.MEDIUM.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.MEDIUM.getNumberOfEpoc()))) / 7;
//                break;
//            case HIGH:
//                burnedKcalInExercises = ((durationOfOneStrongWorkout * numberOfStrongWorkoutsInWeek * (IntensityOfStrongWorkoutsLevel.LOW.getLevelOfIntensityStrongWorkouts()) +
//                        (numberOfStrongWorkoutsInWeek * (EpocInStrongWorkouts.LOW.getNumberOfEpoc() / 100 * BMR))) +
//                        (durationOfOneAerobicWorkout * numberOfAerobicWorkoutsInWeek * (IntensityOfAerobicWorkoutsLevel.HIGH.getLevelOfIntensityAerobicWorkouts()) + (EpocInAerobicWorkouts.HIGH.getNumberOfEpoc()))) / 7;
//            default:
//                break;
//
//        }
//        return burnedKcalInExercises;
//    }
//}
