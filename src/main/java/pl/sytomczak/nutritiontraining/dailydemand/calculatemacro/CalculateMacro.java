package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

import pl.sytomczak.nutritiontraining.dailydemand.DailyDemandCalculation;

public class CalculateMacro {
    private int protein;
    private int fat;
    private double carbs;
    private VariableCaloriesDependingOnWeightChange caloriesDependingOnWeightChange;

    private DailyDemandCalculation dailyDemandCalculation;
    private DailyDemandCalculation weight;

    public CalculateMacroResult calculationMacro() {
        int proteinResult = calculateDailyProtein();
        double carbsResult = calculateDailyCarbs();
        int fatResult = calculateDailyFat();
        double calories = calculateMacro(caloriesDependingOnWeightChange);
        return new CalculateMacroResult(carbsResult, proteinResult, fatResult, calories);
    }

    private double calculateMacro(VariableCaloriesDependingOnWeightChange caloriesDependingOnWeightChange) {
        dailyDemandCalculation = new DailyDemandCalculation();
        double calculateCalories = 0;

        switch (caloriesDependingOnWeightChange) {
            case LOSE:
                 calculateCalories = dailyDemandCalculation.getDailyDemand() - VariableCaloriesDependingOnWeightChange.LOSE.getNumberOfCaloriesDependingOnWeightChange();
                break;
            case GAIN:
                calculateCalories = dailyDemandCalculation.getDailyDemand() + VariableCaloriesDependingOnWeightChange.GAIN.getNumberOfCaloriesDependingOnWeightChange();
                break;
            case KEEP:
                calculateCalories = dailyDemandCalculation.getDailyDemand() + VariableCaloriesDependingOnWeightChange.KEEP.getNumberOfCaloriesDependingOnWeightChange();
                break;
            default:
                break;
        }
        return calculateCalories;
    }

        private int calculateDailyProtein () {
            weight = new DailyDemandCalculation();
            protein = 2 * weight.getWeight();
            return protein;

        }

        private int calculateDailyFat () {
            fat = weight.getWeight();
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
