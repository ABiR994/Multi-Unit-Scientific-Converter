public class TemperatureConverter extends Converter {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public TemperatureConverter() {
        super();
        this.celsius = 0.0;
        this.fahrenheit = 0.0;
        this.kelvin = 0.0;
    }

    public TemperatureConverter(int unit, double value) {
        super(unit,value);
    }

    public void celsius() {
        this.celsius = getValue();
        this.fahrenheit = ((9.0 / 5.0) * getValue()) + 32.0;
        this.kelvin = getValue() + 273.0;
    }

    public void fahrenheit() {
        this.celsius = ((getValue() - 32.0) / 9.0) * 5.0;
        this.fahrenheit = getValue();
        this.kelvin = (((getValue() - 32.0) / 9.0) * 5.0) + 273.0;
    }

    public void kelvin() {
        this.celsius = getValue() - 273.0;
        this.fahrenheit = (((getValue() - 273.0) / 5.0) * 9.0) + 32.0;
        this.kelvin = getValue();
    }

    public void conversion() {
        System.out.print("Converting " + getValue());
        if(getUnit() == 1) {
            System.out.println(" \u00B0C");
            celsius();
        } else if(getUnit() == 2) {
            System.out.println(" \u00B0F");
            fahrenheit();
        } else if(getUnit() == 3) {
            System.out.println(" K");
            kelvin();
        }
    }

    public void display() {
        super.display();
        System.out.println("Celsius:    " + String.format("%.3f", this.celsius) + " \u00B0C");
        System.out.println("Fahrenheit: " + String.format("%.3f", this.fahrenheit) + " \u00B0F");
        System.out.println("Kelvin:     " + String.format("%.3f", this.kelvin) + " K");
        System.out.println("\u001B[34m----------------------------\u001B[0m");
    }
}