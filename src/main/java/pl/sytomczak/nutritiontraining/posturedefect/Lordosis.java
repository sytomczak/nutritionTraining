package pl.sytomczak.nutritiontraining.posturedefect;

import java.util.ArrayList;
import java.util.List;

public class Lordosis extends PrintableTreatment {

    public List<Treatment> getTreatmentList() {
        List<Treatment> treatments = new ArrayList<Treatment>();
        treatments.add(Treatment.DELETE_THIS);

        return treatments;
    }
}
