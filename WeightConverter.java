public class WeightConverter extends Converter {
    private double gram;
    private double kilogram;
    private double pound;

    public WeightConverter() {
        super();
        this.gram = 0.0;
        this.kilogram = 0.0;
        this.pound = 0.0;
    }

    public WeightConverter(int unit, double value) {
        super(unit, value);
    }

    public void gram() {
        this.gram = getValue();
        this.kilogram = getValue() / 1000.0;
        this.pound = getValue() / 453.592;
    }

    public void kilogram() {
        this.gram = getValue() * 1000.0;
        this.kilogram = getValue();
        this.pound = (getValue() * 1000.0) / 453.592;
    }

    public void pound() {
        this.gram = getValue() * 453.592;
        this.kilogram = (getValue() * 453.592) / 1000.0;
        this.pound = getValue();
    }

    public void conversion() {
        System.out.print("Converting " + getValue());
        if(getUnit() == 1) {
            System.out.println(" g");
            gram();
        } else if(getUnit() == 2) {
            System.out.println(" kg");
            kilogram();
        } else if(getUnit() == 3) {
            System.out.println(" lb");
            pound();
        }
    }

    public void display() {
        super.display();
        System.out.println("Gram:     " + String.format("%.3f", this.gram) + " g");
        System.out.println("Kilogram: " + String.format("%.3f", this.kilogram) + " kg");
        System.out.println("Pound:      " + String.format("%.3f", this.pound) + " lb");
        System.out.println("\u001B[34m----------------------------\u001B[0m");
    }
}
