public class TimeConverter extends Converter {
    private double second;
    private double minute;
    private double hour;

    public TimeConverter() {
        super();
        this.second = 0.0;
        this.minute = 0.0;
        this.hour = 0.0;
    }

    public TimeConverter(int unit, double value) {
        super(unit, value);
    }

    public void second() {
        this.second = getValue();
        this.minute = getValue() / 60.0;
        this.hour = getValue() / 3600.0;
    }

    public void minute() {
        this.second = getValue() * 60.0;
        this.minute = getValue();
        this.hour = getValue() / 60.0;
    }

    public void hour() {
        this.second = getValue() * 3600.0;
        this.minute = getValue() * 60.0;
        this.hour = getValue();
    }

    public void conversion() {
        System.out.print("Converting " + getValue());
        if(getUnit() == 1) {
            System.out.println(" s");
            second();
        } else if(getUnit() == 2) {
            System.out.println(" min");
            minute();
        } else if(getUnit() == 3) {
            System.out.println(" h");
            hour();
        }
    }

    public void display() {
        super.display();
        System.out.println("Second:   " + String.format("%.3f", this.second) + " s");
        System.out.println("Minute:   " + String.format("%.3f", this.minute) + " min");
        System.out.println("Hour:     " + String.format("%.3f", this.hour) + " h");
        System.out.println("\u001B[34m----------------------------\u001B[0m");
    }
}
