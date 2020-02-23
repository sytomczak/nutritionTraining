package pl.sytomczak.nutritiontraining;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ChallengeProperties {

    INSTANCE;

    private final Properties properties;

    ChallengeProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("dailychallenge.properties"));
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public Properties getProperties() {
        return properties;
    }
}
