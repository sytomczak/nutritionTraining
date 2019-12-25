package pl.sytomczak.nutritiontraining.dailydemand.intensity;

public enum IntensityOfStrongWorkoutsLevel {
    LOW(7),
    MEDIUM(8),
    HIGH(9);

    private int levelOfIntensityStrongWorkouts;

    IntensityOfStrongWorkoutsLevel(int levelOfIntensityStrongWorkouts) {
        this.levelOfIntensityStrongWorkouts = levelOfIntensityStrongWorkouts;}

        public int getLevelOfIntensityStrongWorkouts() {
            return levelOfIntensityStrongWorkouts;

    }
}
