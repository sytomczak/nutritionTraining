package pl.sytomczak.nutritiontraining.posturedefect;

public enum Treatment {
    DELETE_THIS();

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

