package day170901.enumexamples;

public enum Seasons {
    WINTER("low"), SPRING("middle"), SUMMER("high"), AUTUMN("medium");

    private final String temperature;

    Seasons() {
        temperature = "default";
    }

    Seasons(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
