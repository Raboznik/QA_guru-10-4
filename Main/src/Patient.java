public class Patient {

    private final double MIN_TEMPERATURE = 32.0;
    private final double MAX_TEMPERATURE = 40.0;
    private final double MIN_FINE_TEMPERATURE = 36.2;
    private final double MAX_FINE_TEMPERATURE = 36.9;
    private double temperature;
    private boolean isFine;

    public Patient() {
        this.temperature = getRandomTemperature();
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isFine() {
        if (temperature >= MIN_FINE_TEMPERATURE && temperature <= MAX_FINE_TEMPERATURE)
            isFine = true;
        return isFine;
    }

    public double getRandomTemperature() {
        temperature = (Math.random() * ((MAX_TEMPERATURE - MIN_TEMPERATURE))) + MIN_TEMPERATURE;
        temperature = temperature * 10;
        double rounding = Math.round(temperature);
        temperature = rounding / 10;
        return temperature;
    }
}

