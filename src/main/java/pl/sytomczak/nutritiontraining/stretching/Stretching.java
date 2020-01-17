package pl.sytomczak.nutritiontraining.stretching;

public enum Stretching {

    COS, BICEPS;

    @Override
    public String toString() {
        return convertToHumanReadable(this.name());
    }

    private String convertToHumanReadable(String name) {
        name = name.replace('_',  ' ');
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase()+name.substring(1);
        return name;
    }

}
