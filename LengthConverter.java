public class LengthConverter extends Converter {
    private double meter;
    private double kilometer;
    private double foot;
    private double mile;

    public LengthConverter() {
        super();
        this.meter = 0.0;
        this.kilometer = 0.0;
        this.foot = 0.0;
        this.mile = 0.0;
    }

    public LengthConverter(int unit, double value){
        super(unit, value);
    }

    public void meter() {
        this.meter = getValue();
        this.kilometer = getValue() / 1000.0;
        this.foot = getValue() / 0.3048;
        this.mile = getValue() / 1609.34;
    }

    public void kilometer() {
        this.meter = getValue() * 1000.0;
        this.kilometer = getValue();
        this.foot = (getValue() * 1000.0) / 0.3048;
        this.mile = (getValue() * 1000.0) / 1609.34;
    }

    public void foot() {
        this.meter = getValue() * 0.3048;
        this.kilometer = (getValue() * 0.3048) / 1000.0;
        this.foot = getValue();
        this.mile = (getValue() * 0.3048) / 1609.34;
    }

    public void mile() {
        this.meter = getValue() * 1609.34;
        this.kilometer = (getValue() * 1609.34) / 1000.0;
        this.foot = (getValue() * 1609.34) / 0.3048;
    }

    public void conversion() {
        System.out.print("Converting " + getValue());
        if(getUnit() == 1) {
            System.out.println(" m");
            meter();
        } else if(getUnit() == 2) {
            System.out.println(" km");
            kilometer();
        } else if(getUnit() == 3) {
            System.out.println(" ft");
            foot();
        } else if(getUnit() == 4) {
            System.out.println(" mile");
            mile();
        }
    }

    public void display() {
        super.display();
        System.out.println("Meter:     " + String.format("%.3f", this.meter) + " m");
        System.out.println("Kilometer: " + String.format("%.3f", this.kilometer) + " km");
        System.out.println("Feet:      " + String.format("%.3f", this.foot) + " ft");
        System.out.println("Mile:      " + String.format("%.3f", this.mile) + " mile");
        System.out.println("\u001B[34m----------------------------\u001B[0m");
    }
}
