package pl.sytomczak.nutritiontraining.dailydemand;

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
}
