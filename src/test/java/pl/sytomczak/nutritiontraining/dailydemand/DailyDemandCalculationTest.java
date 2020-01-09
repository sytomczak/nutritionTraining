package pl.sytomczak.nutritiontraining.dailydemand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfAerobicWorkoutsLevel;
import pl.sytomczak.nutritiontraining.dailydemand.intensity.IntensityOfStrongWorkoutsLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.DailyActivityLevel;
import pl.sytomczak.nutritiontraining.dailydemand.physique.Physique;

import java.util.stream.Stream;

class DailyDemandCalculationTest {

    private DailyDemandCalculation calculator;

    @BeforeEach
    public void setUp() {
        calculator = new DailyDemandCalculation();
    }

    @ParameterizedTest
    @MethodSource("provideDataForDemandCalculation")
    public void shouldCalculateDailyDemand(CalculationResult expectedResult, Gender gender, int age, int weight, int height, Physique physique, DailyActivityLevel selectedDailyActivity, int numberOfAerobicWorkoutsInWeek, int durationOfOneAerobicWorkout, IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel, int numberOfStrongWorkoutsInWeek, int durationOfOneStrongWorkout, IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel) {

        calculator.setGender(gender);
        calculator.setAge(age);
        calculator.setWeight(weight);
        calculator.setHeight(height);
        calculator.setPhysique(physique);
        calculator.setSelectedDailyActivity(selectedDailyActivity);
        calculator.setNumberOfAerobicWorkoutsInWeek(numberOfAerobicWorkoutsInWeek);
        calculator.setDurationOfOneAerobicWorkout(durationOfOneAerobicWorkout);
        calculator.setIntensityOfAerobicWorkoutsLevel(intensityOfAerobicWorkoutsLevel);
        calculator.setNumberOfStrongWorkoutsInWeek(numberOfStrongWorkoutsInWeek);
        calculator.setDurationOfOneStrongWorkout(durationOfOneStrongWorkout);
        calculator.setIntensityOfStrongWorkoutsLevel(intensityOfStrongWorkoutsLevel);

        CalculationResult result = calculator.calculateDailyDemand();
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideDataForDemandCalculation() {
        return Stream.of(
                Arguments.of(new CalculationResult(29.38, 2665, 80), Gender.FEMALE, 45, 80, 165, Physique.ECTOMORPH, DailyActivityLevel.LOW, 4, 40, IntensityOfAerobicWorkoutsLevel.LOW, 2, 60, IntensityOfStrongWorkoutsLevel.MEDIUM),
                Arguments.of(new CalculationResult(31.51, 2690, 90), Gender.FEMALE, 36, 90, 169, Physique.MESOMORPH, DailyActivityLevel.HIGH, 2, 70, IntensityOfAerobicWorkoutsLevel.LOW, 5, 30, IntensityOfStrongWorkoutsLevel.HIGH),
                Arguments.of(new CalculationResult(17.96, 2134, 55), Gender.FEMALE, 24, 55, 175, Physique.ENDOMORPH, DailyActivityLevel.MEDIUM, 3, 20, IntensityOfAerobicWorkoutsLevel.HIGH, 3, 60, IntensityOfStrongWorkoutsLevel.MEDIUM),
                Arguments.of(new CalculationResult(29.14, 1965, 70), Gender.FEMALE, 21, 70, 155, Physique.ENDOMORPH, DailyActivityLevel.LOW, 6, 30, IntensityOfAerobicWorkoutsLevel.MEDIUM, 1, 45, IntensityOfStrongWorkoutsLevel.LOW),

                Arguments.of(new CalculationResult(21.6, 2763, 70), Gender.MALE, 26, 70, 180, Physique.MESOMORPH, DailyActivityLevel.MEDIUM, 2, 60, IntensityOfAerobicWorkoutsLevel.MEDIUM, 4, 40, IntensityOfStrongWorkoutsLevel.HIGH),
                Arguments.of(new CalculationResult(34.6, 2998, 100), Gender.MALE, 32, 100, 170, Physique.ENDOMORPH, DailyActivityLevel.HIGH, 1, 80, IntensityOfAerobicWorkoutsLevel.HIGH, 4, 70, IntensityOfStrongWorkoutsLevel.MEDIUM),
                Arguments.of(new CalculationResult(20.76, 2748, 60), Gender.MALE, 48, 60, 170, Physique.ECTOMORPH, DailyActivityLevel.MEDIUM, 5, 40, IntensityOfAerobicWorkoutsLevel.MEDIUM, 1, 40, IntensityOfStrongWorkoutsLevel.LOW),
                Arguments.of(new CalculationResult(17.72, 1893, 50), Gender.MALE, 62, 50, 168, Physique.MESOMORPH, DailyActivityLevel.LOW, 3, 10, IntensityOfAerobicWorkoutsLevel.LOW, 3, 20, IntensityOfStrongWorkoutsLevel.LOW)
        );
    }
}