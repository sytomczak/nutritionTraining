package pl.sytomczak.nutritiontraining.clock;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

    public static void runClock(JEditorPane clockPanel) {
        Thread thread = new Thread() {

            public void run() {
                while (true) {
                    DateFormat calendar = new SimpleDateFormat("HH : mm : ss");

                    String data = calendar.format(new Date()).toString();
                    clockPanel.setText(data);

                    try {
                        sleep(1);
                    } catch (Exception ex) {
                        ex.fillInStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}

