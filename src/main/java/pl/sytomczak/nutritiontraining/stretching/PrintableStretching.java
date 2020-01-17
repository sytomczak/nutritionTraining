package pl.sytomczak.nutritiontraining.stretching;

import java.util.List;

public abstract class PrintableStretching {

    private static final String NEW_LINE_CHARACTER = "\n";

    public abstract List<Stretching> getStretchingList();

    public final String getStretching() {
        StringBuilder htmlStretchingList = new StringBuilder();
        htmlStretchingList.append("<html>");
        htmlStretchingList.append("<body>");

        getStretchingList().forEach(e -> {
            htmlStretchingList.append("<p>");
            htmlStretchingList.append(e.toString());
            htmlStretchingList.append("</p>");
            htmlStretchingList.append("<br>");
        });

        htmlStretchingList.append("</body>");
        htmlStretchingList.append("</html>");

        return htmlStretchingList.toString();
    }

}
