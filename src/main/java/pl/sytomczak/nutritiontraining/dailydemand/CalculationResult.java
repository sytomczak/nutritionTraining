package pl.sytomczak.nutritiontraining.dailydemand;

import java.util.Objects;

public class CalculationResult {
    private double bmi;
    private int demandInKcal;

    public CalculationResult(double bmi, int demandInKcal) {
        this.bmi = bmi;
        this.demandInKcal = demandInKcal;
    }

    public double getBmi() {
        return bmi;
    }

    public int getDemandInKcal() {
        return demandInKcal;
    }

    @Override
    public String toString() {
        return "CalculationResult{" +
                "bmi=" + bmi +
                ", demandInKcal=" + demandInKcal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculationResult result = (CalculationResult) o;
        return Double.compare(result.bmi, bmi) == 0 &&
                demandInKcal == result.demandInKcal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bmi, demandInKcal);
    }
}
