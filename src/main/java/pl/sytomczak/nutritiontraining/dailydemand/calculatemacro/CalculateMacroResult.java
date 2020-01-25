package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

import java.util.Objects;

public class CalculateMacroResult {
    private int fat;
    private int protein;
    private int carbs;
    private int calories;

    public CalculateMacroResult(int calories, int protein, int fat, int carbs) {
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }


    @Override
    public String toString() {
        return "CalculationMacroResult{" +
                "protein=" + protein + ", fat=" + fat + ", kcal=" + calories + ", carbs=" + carbs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculateMacroResult result = (CalculateMacroResult) o;
        return fat == result.fat &&
                protein == result.protein &&
                carbs == result.carbs &&
                calories == result.calories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fat, protein, carbs, calories);
    }
}
