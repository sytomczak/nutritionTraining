package pl.sytomczak.nutritiontraining.dailydemand;

import pl.sytomczak.nutritiontraining.dailydemand.physique.DailyActivity;
import pl.sytomczak.nutritiontraining.dailydemand.physique.Physique;

public class DailyDemandCalculation {

        private int weight;
        private int height;
        private int age;

        private Physique physique;
        private Gender gender;
        private DailyActivity dailyActivity; //3 opcje do 3 ludzi

        //TODO: osobna klasa do zmiennych treningu siłowego

        private int numberOfStrongWorkoutsInWeek;
        private int durationOfOneStrongWorkout;
        private int intensityOfStrongWorkouts; // 3 opcje

        //TODO: klasa do treningu aeorobowego

        private int numberOfAerobicWorkouts;
        private int durationOdOneAerobicWorkout;
        private int intensityOfAerobicWorkouts; // 3 opcje niski sredni wysoki

}

