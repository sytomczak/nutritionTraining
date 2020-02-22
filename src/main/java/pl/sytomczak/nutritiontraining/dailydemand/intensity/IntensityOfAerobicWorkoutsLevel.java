package pl.sytomczak.nutritiontraining.dailydemand.intensity;

public enum IntensityOfAerobicWorkoutsLevel {
    LOW(5),
    MEDIUM(7.5),
    HIGH(10);

    private double levelOfIntensityAerobicWorkouts;

    IntensityOfAerobicWorkoutsLevel(double levelOfIntensityAerobicWorkouts) {
        this.levelOfIntensityAerobicWorkouts = levelOfIntensityAerobicWorkouts;
    }

    public double getLevelOfIntensityAerobicWorkouts() {
        return levelOfIntensityAerobicWorkouts;

    }
}
