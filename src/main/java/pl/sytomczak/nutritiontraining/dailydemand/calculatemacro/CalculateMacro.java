package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

import pl.sytomczak.nutritiontraining.dailydemand.CalculationResult;
import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;

public class CalculateMacro {
    private int protein;
    private int fat;
    private double carbs;
    private VariableCaloriesDependingOnWeightChange caloriesDependingOnWeightChange;

    private DailyDemandCalculation dailyDemandCalculation;
    private DailyDemandCalculation weight;
    private CalculationResult result;

    public CalculateMacro(CalculationResult calculation) {
        result = calculation;
    }

    public CalculateMacroResult calculationMacro() {
        int proteinResult = calculateDailyProtein();
        double carbsResult = calculateDailyCarbs();
        int fatResult = calculateDailyFat();
        double calories = calculateMacro(caloriesDependingOnWeightChange);
        return new CalculateMacroResult(carbsResult, proteinResult, fatResult, calories);
    }

    private double calculateMacro(VariableCaloriesDependingOnWeightChange caloriesDependingOnWeightChange) {
        double calculateCalories = 0;

        switch (caloriesDependingOnWeightChange) {
            case LOSE:
                 calculateCalories = result.getDemandInKcal() - VariableCaloriesDependingOnWeightChange.LOSE.getNumberOfCaloriesDependingOnWeightChange();
                break;
            case GAIN:
                calculateCalories = result.getDemandInKcal() + VariableCaloriesDependingOnWeightChange.GAIN.getNumberOfCaloriesDependingOnWeightChange();
                break;
            case KEEP:
                calculateCalories = result.getDemandInKcal() + VariableCaloriesDependingOnWeightChange.KEEP.getNumberOfCaloriesDependingOnWeightChange();
                break;
            default:
                break;
        }
        return calculateCalories;
    }

        private int calculateDailyProtein () {
            protein = 2 * result.getWeight();
            return protein;

        }

        private int calculateDailyFat () {
            fat = result.getWeight();
            return fat;

        }

        private double calculateDailyCarbs () {
            double kcal = 0;
            double calculateKcal = calculateMacro(caloriesDependingOnWeightChange);
            kcal =  calculateKcal - ((fat * 9) + (protein * 4));
            carbs = kcal / 4;
            return Math.round(carbs * 100.0) / 100.0;
        }

        public int getProtein () {
            return protein;
        }

        public void setProtein ( int protein){
            this.protein = protein;
        }

        public int getFat () {
            return fat;
        }

        public void setFat ( int fat){
            this.fat = fat;
        }

        public double getCarbs () {
            return carbs;
        }

        public void setCarbs ( double carbs){
            this.carbs = carbs;
        }

    public VariableCaloriesDependingOnWeightChange getCaloriesDependingOnWeightChange() {
        return caloriesDependingOnWeightChange;
    }

    public void setCaloriesDependingOnWeightChange(VariableCaloriesDependingOnWeightChange caloriesDependingOnWeightChange) {
        this.caloriesDependingOnWeightChange = caloriesDependingOnWeightChange;
    }

    public DailyDemandCalculation getDailyDemandCalculation () {
            return dailyDemandCalculation;
        }

        public void setDailyDemandCalculation (DailyDemandCalculation dailyDemandCalculation){
            this.dailyDemandCalculation = dailyDemandCalculation;
        }

        public DailyDemandCalculation getWeight () {
            return weight;
        }

        public void setWeight (DailyDemandCalculation weight){
            this.weight = weight;
        }

    }
