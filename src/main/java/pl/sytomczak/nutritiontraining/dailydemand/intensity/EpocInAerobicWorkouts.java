package pl.sytomczak.nutritiontraining.dailydemand.intensity;

public enum EpocInAerobicWorkouts {
        LOW(5),
        MEDIUM(35),
        HIGH(180);

        //@Getter mi nie dziala
        private int numberOfEpoc;

        EpocInAerobicWorkouts(int numberOfEpoc) {this.numberOfEpoc = numberOfEpoc;}

        public int getNumberOfEpoc() {
            return numberOfEpoc;
        }
}
