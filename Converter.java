public class Converter {
    private int unit;
    private double value;

    public Converter() {
        this.unit = 0;
        this.value = 0.0;
    }

    public Converter(int unit,double value) {
        this.unit = unit;
        this.value = value;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void conversion() {

    }
    
    public void display() {
        System.out.println("\n\u001B[34mResult:");
        System.out.println("----------------------------\u001B[0m");
    }
}
