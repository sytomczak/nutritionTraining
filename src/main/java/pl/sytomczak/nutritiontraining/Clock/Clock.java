package pl.sytomczak.nutritiontraining.Clock;

import javax.swing.*;
import java.io.StringReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock {


    private int second;
    private int min;
    private int hour;
    private int am_pm;
    private String d_n;

    public void clock() {

        Thread thread = new Thread() {
            public void run() {
                try {
                    for (; ; ) {
                        Calendar calendar = new GregorianCalendar();
                        second = calendar.get(Calendar.SECOND);
                        min = calendar.get(Calendar.MINUTE);
                        hour = calendar.get(Calendar.HOUR);
                        am_pm = calendar.get(Calendar.AM_PM);

                        d_n = "";
                        if (am_pm == 1) {
                            d_n = "PM";
                        } else
                            d_n = "AM";

                        System.out.println(hour + ":" + min + ":" + second + " " + d_n);
                        sleep(1000);
                    }
                } catch (Exception ex) {
                    ex.fillInStackTrace();
                }
            }
        };
        thread.start();
    }
}

