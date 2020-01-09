package pl.sytomczak.nutritiontraining.dailydemand.intensity;


public enum EpocInStrongWorkouts {
    LOW(4),
    MEDIUM(5.5),
    HIGH(7);

    private double numberOfEpoc;

    EpocInStrongWorkouts(double numberOfEpoc) {this.numberOfEpoc = numberOfEpoc;}

    public double getNumberOfEpoc() {
        return numberOfEpoc;
    }
}
