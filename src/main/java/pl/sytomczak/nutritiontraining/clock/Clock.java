package pl.sytomczak.nutritiontraining.clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

    private String data;

    public String clock() {

        Thread thread = new Thread() {
            public void run() {
                while (true) {
                    DateFormat calendar = new SimpleDateFormat("hh : mm : ss aa");

                    String data = calendar.format(new Date()).toString();

                    try {
                        sleep(1);
                    } catch (Exception ex) {
                        ex.fillInStackTrace();
                    }
                }
            }
        };
        thread.start();
        return data;
    }

}

