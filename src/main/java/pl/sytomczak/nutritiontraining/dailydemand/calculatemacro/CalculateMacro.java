package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;

public class CalculateMacro {
    private int protein;
    private int fat;
    private double carbs;

    private double caloriesDependingOnWeightChange;

    private DailyDemandCalculation dailyDemandCalculation;
    private DailyDemandCalculation weight;

    public double CalculateMacro(VariableCaloriesDependingOnWeightChange variableCaloriesDependingOnWeightChange) {
        dailyDemandCalculation = new DailyDemandCalculation();

        if (VariableCaloriesDependingOnWeightChange.LOSE.equals(variableCaloriesDependingOnWeightChange)) {
            return caloriesDependingOnWeightChange = dailyDemandCalculation.getDailyDemand() - VariableCaloriesDependingOnWeightChange.LOSE.getNumberOfCaloriesDependingOnWeightChange();
        } else if (VariableCaloriesDependingOnWeightChange.GAIN.equals(variableCaloriesDependingOnWeightChange)) {
            return caloriesDependingOnWeightChange = dailyDemandCalculation.getDailyDemand() + VariableCaloriesDependingOnWeightChange.GAIN.getNumberOfCaloriesDependingOnWeightChange();
        } else return caloriesDependingOnWeightChange = dailyDemandCalculation.getDailyDemand();
    }

    private int CalculateDailyProtein() {
        weight = new DailyDemandCalculation();
        protein = 2 * weight.getWeight();
        return protein;

    }

    private int CalculateDailyFat() {
        fat = weight.getWeight();
        return fat;

    }

    private double CalculateDailyCarbs() {
        double kcal = 0;
        kcal = dailyDemandCalculation.getDailyDemand() - ((fat * 9) + (protein * 4));
        carbs = kcal /4;
        return Math.round(carbs * 100.0) / 100.0;
    }


}
