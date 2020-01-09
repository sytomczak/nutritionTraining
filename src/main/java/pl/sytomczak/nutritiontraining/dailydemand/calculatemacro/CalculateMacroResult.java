package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

import java.util.Objects;

public class CalculateMacroResult {
    private int fat;
    private int protein;
    private double carbs;
    private double calories;

    public CalculateMacroResult(double carbs, int protein, int fat, double calories) {
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
        this.calories = calories;
    }

    public double getCarbs() {
        return carbs;
    }
    public int getFat() {
        return fat;
    }

    public double getCalories() {
    return calories;
    }

    public int getProtein() {
        return protein;
    }

    @Override
    public String toString() {
        return "CalculationMacroResult{" +
                "carbs=" + carbs +
                ", protein=" + protein + "fat=" + fat + "kcal=" + calories +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculateMacroResult that = (CalculateMacroResult) o;
        return fat == that.fat &&
                protein == that.protein &&
                Double.compare(that.carbs, carbs) == 0 &&
                Double.compare(that.calories, calories) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fat, protein, carbs, calories);
    }
}
