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


    @ParameterizedTest
    @MethodSource("provideDateForCalculateMacro")
    public void shouldCalculateMacro(CalculateMacroResult expectedResult, VariableCaloriesDependingOnWeightChange caloriesDependingOnChoice, int weight) {
        calculateMacro = new CalculateMacro(new CalculationResult(23.44, 1834,60));
        calculateMacro = new CalculateMacro(new CalculationResult(28.73, 2854,90));

        calculateMacro.setCaloriesDependingOnWeightChange(caloriesDependingOnChoice);
        calculateMacro.setWeight(weight);

        CalculateMacroResult result = calculateMacro.calculationMacro();
        Assertions.assertEquals(expectedResult, result);
    }


    public static Stream<Arguments> provideDateForCalculateMacro() {
        return Stream.of(
//                Arguments.of(new CalculateMacroResult(1968, 120, 60, 237), VariableCaloriesDependingOnWeightChange.KEEP, 60),
                Arguments.of(new CalculateMacroResult(1834,120, 70,181), VariableCaloriesDependingOnWeightChange.KEEP, 60),
                Arguments.of(new CalculateMacroResult(3054, 189, 100,349), VariableCaloriesDependingOnWeightChange.GAIN, 90)

        );
    }
}

