package pl.sytomczak.nutritiontraining.dailydemand.calculatemacro;

public enum VariableCaloriesDependingOnWeightChange {
    LOSE(100),
    KEEP(0),
    GAIN(200);

    private int numberOfCaloriesDependingOnWeightChange;

    VariableCaloriesDependingOnWeightChange(int numberOfCaloriesDependingOnWeightChange) {
        this.numberOfCaloriesDependingOnWeightChange = numberOfCaloriesDependingOnWeightChange;
    }

    public int getNumberOfCaloriesDependingOnWeightChange() {
        return numberOfCaloriesDependingOnWeightChange;
    }

}
