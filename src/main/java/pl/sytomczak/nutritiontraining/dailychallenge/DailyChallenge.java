package pl.sytomczak.nutritiontraining.dailychallenge;

import pl.sytomczak.nutritiontraining.ChallengeProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;

public class DailyChallenge {

    private static Properties CHALLENGE_PROPERTIES = ChallengeProperties.INSTANCE.getProperties();

    List<String> challengeList = new ArrayList<>();

    public String getRandomChallenge() {
        populateChallengeList();
        return randomizeChallenge();
    }

    private String randomizeChallenge() {
        int lastIndex = challengeList.size() - 1;
        int randomNum = ThreadLocalRandom.current().nextInt(0, lastIndex);

        return challengeList.get(randomNum);
    }

    private void populateChallengeList() {
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.12.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.25.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.40.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.45.burpees"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.50.burpees"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10.pushups"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20.pushups"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30.pushups"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.40.pushups"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.50.pushups"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.40s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.50s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.60s.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x20s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x30s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x60s.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x20s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x30s.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x60s.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.8.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.16.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.25.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.45.squats"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x8.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x16.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x25.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x45.squats"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x8.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x16.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x25.squats"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x45.squats"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.45.leg.lifts"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x15.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x30.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x45.leg.lifts"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x15.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x30.leg.lifts"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x45.leg.lifts"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.60s.wall.sit"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x20s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x30s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x60s.wall.sit"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x20s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x30s.wall.sit"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x60s.wall.sit"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.40s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.60s.side.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x20s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x40s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.2x60s.side.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x20s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x40s.side.plank"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.3x60s.side.plank"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.0,5l.water"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.1l.water"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.1,5l.water"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15m.walk"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.25m.walk"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.35m.walk"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.5m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.25m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.35m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.40m.stretching"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.45m.stretching"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10m.rolling"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15m.rolling"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20m.rolling"));

        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.5m.quick.training"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10m.quick.training"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.15m.quick.training"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20m.quick.training"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.25m.quick.training"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.30m.quick.training"));
    }

}
