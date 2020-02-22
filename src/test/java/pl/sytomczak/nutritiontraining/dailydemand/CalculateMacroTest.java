package pl.sytomczak.nutritiontraining.dailydemand;

import com.sun.org.apache.xpath.internal.Arg;
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
    public void shouldCalculateMacro(CalculateMacroResult expectedResult, VariableCaloriesDependingOnWeightChange caloriesDependingOnChoice, int weight, CalculationResult calculationResult) {
        calculateMacro = new CalculateMacro(calculationResult);

        calculateMacro.setCaloriesDependingOnWeightChange(caloriesDependingOnChoice);
        calculateMacro.setWeight(weight);

        CalculateMacroResult result = calculateMacro.calculationMacro();
        Assertions.assertEquals(expectedResult, result);
    }


    public static Stream<Arguments> provideDateForCalculateMacro() {
        return Stream.of(
                Arguments.of(new CalculateMacroResult(2518, 207, 100, 197), VariableCaloriesDependingOnWeightChange.LOSE, 90, new CalculationResult(27.78, 2618, 90)),
                Arguments.of(new CalculateMacroResult(1834, 120, 70, 181), VariableCaloriesDependingOnWeightChange.KEEP, 60, new CalculationResult(23.44, 1834, 60)),
                Arguments.of(new CalculateMacroResult(3054, 189, 100, 349), VariableCaloriesDependingOnWeightChange.GAIN, 90, new CalculationResult(28.73, 2854, 90)),
                Arguments.of(new CalculateMacroResult(3433, 147, 80, 531), VariableCaloriesDependingOnWeightChange.GAIN, 70, new CalculationResult(19.39, 3233, 70)),
                Arguments.of(new CalculateMacroResult(2185, 128, 74, 251), VariableCaloriesDependingOnWeightChange.KEEP, 64, new CalculationResult(22.68, 2185, 64)),
                Arguments.of(new CalculateMacroResult(2312, 184, 90, 191), VariableCaloriesDependingOnWeightChange.LOSE, 80, new CalculationResult(26.42, 2412, 80))

        );
    }
}


