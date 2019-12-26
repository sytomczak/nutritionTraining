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

        CalculationResult result = calculator.calculateDailyDemand(gender, age, weight, height, physique, selectedDailyActivity, numberOfAerobicWorkoutsInWeek, durationOfOneAerobicWorkout, intensityOfAerobicWorkoutsLevel, numberOfStrongWorkoutsInWeek, durationOfOneStrongWorkout, intensityOfStrongWorkoutsLevel);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideDataForDemandCalculation() {
        return Stream.of(
          Arguments.of(new CalculationResult(29.38, 2665), Gender.FEMALE, 45, 80, 165, Physique.ECTOMORPH, DailyActivityLevel.LOW, 4, 40, IntensityOfAerobicWorkoutsLevel.LOW, 2, 60, IntensityOfStrongWorkoutsLevel.MEDIUM),
          Arguments.of(new CalculationResult(21.6, 2763), Gender.MALE, 26, 70, 180, Physique.MESOMORPH, DailyActivityLevel.MEDIUM, 2, 60, IntensityOfAerobicWorkoutsLevel.MEDIUM, 4,40, IntensityOfStrongWorkoutsLevel.HIGH)
        );
    }
}