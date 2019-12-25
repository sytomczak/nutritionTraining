package pl.sytomczak.nutritiontraining.dailydemand;

public class CalculationResult {
    private double bmi;
    private double demandInKcal;

    public CalculationResult(double bmi, double demandInKcal) {
        this.bmi = bmi;
        this.demandInKcal = demandInKcal;
    }

    public double getBmi() {
        return bmi;
    }

    public double getDemandInKcal() {
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
