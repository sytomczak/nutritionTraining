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

//    @ParameterizedTest
//    @MethodSource("provideDataForDemandCalculation")
//    public void shouldCalculateDailyDemand(CalculationResult expectedResult, Gender gender, int age, int weight, int height, Physique physique, DailyActivityLevel selectedDailyActivity, int numberOfAerobicWorkoutsInWeek, int durationOfOneAerobicWorkout, IntensityOfAerobicWorkoutsLevel intensityOfAerobicWorkoutsLevel, int numberOfStrongWorkoutsInWeek, int durationOfOneStrongWorkout, IntensityOfStrongWorkoutsLevel intensityOfStrongWorkoutsLevel {

//        CalculationResult result = calculator.calculateDailyDemand(gender, age);
//
//        Assertions.assertEquals(expectedResult, result);
//    }

//    public static Stream<Arguments> provideDataForDemandCalculation() {
//        return Stream.of(
//          Arguments.of(new CalculationResult(21, 1900), Gender.MALE, 26, 80, 174),
//          Arguments.of(new CalculationResult(), Gender.MALE, 18, 120, 184,)
//        );
//    }
}