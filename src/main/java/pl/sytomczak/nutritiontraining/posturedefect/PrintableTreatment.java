package pl.sytomczak.nutritiontraining.posturedefect;

import java.util.List;

public abstract class PrintableTreatment {

    private static final String NEW_LINE_CHARACTER = "\n";

    public abstract List<Treatment> getTreatmentList();

    public final String getTreatments() {
        StringBuilder htmlTreatmentList = new StringBuilder();
        htmlTreatmentList.append("<html>");

        htmlTreatmentList.append("<html>");
        htmlTreatmentList.append("<body>");

        getTreatmentList().forEach(e -> {
            htmlTreatmentList.append("<p>");
            htmlTreatmentList.append(e.toString());
            htmlTreatmentList.append("</p>");
            htmlTreatmentList.append("<br>");
        });

        htmlTreatmentList.append("</body>");
        htmlTreatmentList.append("</html>");

        return htmlTreatmentList.toString();
    }
}