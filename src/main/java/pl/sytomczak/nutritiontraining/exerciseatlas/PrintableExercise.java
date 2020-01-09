package pl.sytomczak.nutritiontraining.exerciseatlas;

import java.util.List;

public abstract class PrintableExercise {

    private static final String NEW_LINE_CHARACTER = "\n";

    public abstract List<Exercise> getExerciseList();

    public final String getExercises() {
        StringBuilder htmlExerciseList = new StringBuilder();
        htmlExerciseList.append("<html>");
        htmlExerciseList.append("<body>");

        getExerciseList().forEach(e -> {
            htmlExerciseList.append("<p>");
            htmlExerciseList.append(e.toString());
            htmlExerciseList.append("</p>");
            htmlExerciseList.append("<br>");
        });

        htmlExerciseList.append("</body>");
        htmlExerciseList.append("</html>");

        return htmlExerciseList.toString();
    }
}
