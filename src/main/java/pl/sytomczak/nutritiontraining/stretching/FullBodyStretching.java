package pl.sytomczak.nutritiontraining.stretching;

import java.util.ArrayList;
import java.util.List;

public class FullBodyStretching {

    public List<Stretching> getStretchingList() {
        List<Stretching> stretchings = new ArrayList<Stretching>();
            stretchings.add(Stretching.TIME_45_MIN);
            stretchings.add(Stretching.TIME_40_MIN);
            stretchings.add(Stretching.TIME_35_MIN);
            stretchings.add(Stretching.TIME_30_MIN);
            stretchings.add(Stretching.TIME_25_MIN);
            stretchings.add(Stretching.TIME_20_MIN);
            stretchings.add(Stretching.TIME_15_MIN);
            stretchings.add(Stretching.TIME_10_MIN);
            stretchings.add(Stretching.TIME_5_MIN);

            return stretchings;

    }
}
