package pl.sytomczak.nutritiontraining.dailydemand.intensity;

public enum EpocInAerobicWorkouts {
    LOW(5),
    MEDIUM(35),
    HIGH(180);

    private int numberOfEpoc;

    EpocInAerobicWorkouts(int numberOfEpoc) {
        this.numberOfEpoc = numberOfEpoc;
    }

    public int getNumberOfEpoc() {
        return numberOfEpoc;
    }
}
