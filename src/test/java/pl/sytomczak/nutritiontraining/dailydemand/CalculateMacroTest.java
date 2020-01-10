package pl.sytomczak.nutritiontraining.dailydemand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.sytomczak.nutritiontraining.dailydemand.calculatemacro.CalculateMacro;
import pl.sytomczak.nutritiontraining.dailydemand.calculatemacro.CalculateMacroResult;
import pl.sytomczak.nutritiontraining.dailydemand.calculatemacro.VariableCaloriesDependingOnWeightChange;

import java.util.stream.Stream;

class CalculateMacroTest {

    private CalculateMacro calculateMacro;
    private CalculationResult calculationResult;

    @BeforeEach
    public void setUp() {
        calculateMacro = new CalculateMacro(calculationResult);
    }

    @ParameterizedTest
    @MethodSource("provideDateForCalculateMacro")
    public void shouldCalculateMacro(CalculateMacroResult expectedResult, VariableCaloriesDependingOnWeightChange caloriesDependingOnChoice, int weight) {

        calculateMacro.setCaloriesDependingOnWeightChange(caloriesDependingOnChoice);
        calculateMacro.setWeight(weight);

        CalculateMacroResult result = calculateMacro.calculationMacro();
        Assertions.assertEquals(expectedResult, result);
    }


    public static Stream<Arguments> provideDateForCalculateMacro() {
        return Stream.of(
                Arguments.of(new CalculateMacroResult(1968, 120, 60, 237), VariableCaloriesDependingOnWeightChange.KEEP, 60),
                Arguments.of(new CalculateMacroResult(1893, 142, 72,118), VariableCaloriesDependingOnWeightChange.LOSE, 62)
                );
    }
}

