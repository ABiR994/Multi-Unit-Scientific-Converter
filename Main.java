import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Converter converter = new Converter();

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n===== MULTI-UNIT SCIENTIFIC CONVERTER =====");
            System.out.println("\n1. Length Converter");
            System.out.println("2. Time Converter");
            System.out.println("3. Weight Converter");
            System.out.println("4. Temperature Converter");

            System.out.print("\nSelect an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    lengthConverter();
                    repeat();
                    break;
                case 2:
                    timeConverter();
                    repeat();
                    break;
                case 3:
                    weightConverter();
                    repeat();
                    break;
                case 4:
                    temperatureConverter();
                    repeat();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    static void repeat() {
        while (true) {
            System.out.print("\nDo you want another conversion? (y/n): ");
            String choice = sc.nextLine().trim();

            if(choice.equalsIgnoreCase("y")) {
                return;
            } else if(choice.equalsIgnoreCase("n")) {
                System.out.println("\nThank you for using the converter. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    static int unit(int a, int b) {
        int unit;
        while(true) {
            System.out.print("\nEnter the index of your unit: ");
            unit = sc.nextInt();
            sc.nextLine();

            if(unit >= a && unit <= b) {
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
        return unit;
    }

    static double value() {
        System.out.print("Enter the value: ");
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }

    static double authenticateValue() {
        double value;
        while(true) {
            value = value();
            if(value >= 0) {
                break;
            } else {
                System.out.println("Invalid value. Please enter a non-negative number.");
            }
        }
        return value;
    }

    static void conversion() {
        converter.conversion();
        converter.display();
    }

    static void lengthConverter() {
        System.out.println("\n----- Length Converter -----");
        System.out.println("Units:");
        System.out.println("1. Meter");
        System.out.println("2. Kilometer");
        System.out.println("3. Mile");
        System.out.println("4. Foot");

        int unit = unit(1, 4);
        double value = authenticateValue();
        converter = new LengthConverter(unit, value);
        conversion();
    }

    static void timeConverter() {
        System.out.println("\n----- Time Converter -----");
        System.out.println("Units:");
        System.out.println("1. Second");
        System.out.println("2. Minute");
        System.out.println("3. Hour");

        int unit = unit(1, 3);
        double value = authenticateValue();
        converter = new TimeConverter(unit, value);
        conversion();
    }

    static void weightConverter() {
        System.out.println("\n----- Weight Converter -----");
        System.out.println("Units:");
        System.out.println("1. Gram");
        System.out.println("2. Kilogram");
        System.out.println("3. Pound");

        int unit = unit(1, 3);
        double value = authenticateValue();
        converter = new WeightConverter(unit, value);
        conversion();
    }

    static void temperatureConverter() {
        System.out.println("\n----- Temperature Converter -----");
        System.out.println("Units:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int unit = unit(1, 3);
        double value = value();
        converter = new TemperatureConverter(unit, value);
        conversion();
    }
}