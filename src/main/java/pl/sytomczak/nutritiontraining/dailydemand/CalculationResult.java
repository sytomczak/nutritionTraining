package pl.sytomczak.nutritiontraining.dailydemand;

import java.util.Objects;

public class CalculationResult {
    private double bmi;
    private int demandInKcal;
    private int weight;

    public CalculationResult(double bmi, int demandInKcal, int weight) {
        this.bmi = bmi;
        this.demandInKcal = demandInKcal;
        this.weight = weight;

    }

    public double getBmi() {
        return bmi;
    }

    public int getDemandInKcal() {
        return demandInKcal;
    }

    public int getWeight() { return weight;}

    @Override
    public String toString() {
        return "CalculationResult{" +
                "bmi=" + bmi +
                ", demandInKcal=" + demandInKcal + "weight=" + weight+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculationResult result = (CalculationResult) o;
        return Double.compare(result.bmi, bmi) == 0 &&

          demandInKcal == result.demandInKcal &&
                weight == result.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bmi, demandInKcal, weight);
    }
}
