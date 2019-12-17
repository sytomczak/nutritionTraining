package pl.sytomczak.nutritiontraining.exerciseatlas;

public enum Exercise {
    SIDE_PLANK_ON_A_HAND("Side plank on a hand");

    private final String text;

    Exercise(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
