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
        int lastIndex = challengeList.size() -1;
        int randomNum = ThreadLocalRandom.current().nextInt(0, lastIndex);

        return challengeList.get(randomNum);
    }

    private void populateChallengeList() {
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10.burpies"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.10.pom"));
        challengeList.add(CHALLENGE_PROPERTIES.getProperty("challenge.20.run"));
    }

}
