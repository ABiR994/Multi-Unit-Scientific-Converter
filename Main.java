import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Converter converter = new Converter();

    public static void main(String[] args) {
        System.out.println("===== MULTI-UNIT SCIENTIFIC CONVERTER =====");
        while(true) {
            System.out.println("\n1. Temperature Converter");
            System.out.println("2. Length Converter");
            System.out.println("3. Weight Converter");

            System.out.print("\nSelect an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    temperatureConverter();
                    repeat();
                    break;
                // case 2:
                //     lengthConverter();
                //     repeat();
                //     break;
                // case 3:
                //     weightConverter();
                //     repeat();
                //     break;
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


    static void temperatureConverter() {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("Unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int unit;
        while(true) {
            System.out.print("\nEnter the index of your unit: ");
            unit = sc.nextInt();
            sc.nextLine();

            if(unit >= 1 && unit <= 3) {
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
        System.out.print("Enter the value: ");
        double value = sc.nextDouble();
        sc.nextLine();

        converter = new TemperatureConverter(unit, value);
        converter.conversion();
        converter.display();
    }
}