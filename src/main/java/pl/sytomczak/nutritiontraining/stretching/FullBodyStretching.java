package pl.sytomczak.nutritiontraining.stretching;

import java.util.ArrayList;
import java.util.List;

public class FullBodyStretching extends PrintableStretching {

    public List<Stretching> getStretchingList() {
        List<Stretching> stretchings = new ArrayList<Stretching>();
            stretchings.add(Stretching.COS);

            return stretchings;

    }
}
