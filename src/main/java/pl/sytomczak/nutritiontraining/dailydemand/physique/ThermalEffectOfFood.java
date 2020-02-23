package pl.sytomczak.nutritiontraining.dailydemand.physique;

public enum ThermalEffectOfFood {
    LOW(0.06),
    MEDIUM(0.08),
    HIGH(0.10);

    private double numberOfThermalEffect;

    ThermalEffectOfFood(double numberOfThermalEffect) {
        this.numberOfThermalEffect = numberOfThermalEffect;
    }

    public double getNumberOfThermalEffect() {
        return numberOfThermalEffect;
    }

}
