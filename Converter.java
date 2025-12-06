public class Converter {
    private double value;

    public Converter() {
        this.value = 0.0;
    }

    public Converter(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
