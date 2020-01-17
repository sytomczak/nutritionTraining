package pl.sytomczak.nutritiontraining.stretching;

import java.util.ArrayList;
import java.util.List;

public class BicepsFemorisAreasButton extends PrintableStretching {

    public List<Stretching> getStretchingList() {
        List<Stretching> stretchings = new ArrayList<Stretching>();
        stretchings.add(Stretching.BICEPS);

        return stretchings;

    }
}

