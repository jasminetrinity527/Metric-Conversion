import java.util.Scanner;

public class MetricConversion {

    public static double convertToKilometers(double meters) {
        return meters / 1000;
    }

    public static double convertToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double convertToKilograms(double grams) {
        return grams / 1000;
    }

    public static double convertToGrams(double kilograms) {
        return kilograms * 1000;
    }

    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double result;
        double value;

        // Ask for a valid number between 0 and 5
        while (true) {
            System.out.print("Please enter a number between 0 and 5: ");
            choice = scanner.nextInt();

            if (choice >= 0 && choice <= 5) {
                break; // Exit the loop if a valid number is entered
            } else {
                System.out.println("Invalid input. Please enter a number between 0 and 5.");
            }
        }

        // Metric Conversion Options
        System.out.println("Metric Conversion Options:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Grams to Kilograms");
        System.out.println("4. Kilograms to Grams");
        System.out.println("5. Fahrenheit to Celsius");
        System.out.println("6. Celsius to Fahrenheit");

        // Perform the conversion based on user choice
        switch (choice) {
            case 1:
                System.out.print("Enter value in meters: ");
                value = scanner.nextDouble();
                result = convertToKilometers(value);
                System.out.println(value + " meters is equal to " + result + " kilometers.");
                break;
            case 2:
                System.out.print("Enter value in kilometers: ");
                value = scanner.nextDouble();
                result = convertToMeters(value);
                System.out.println(value + " kilometers is equal to " + result + " meters.");
                break;
            case 3:
                System.out.print("Enter value in grams: ");
                value = scanner.nextDouble();
                result = convertToKilograms(value);
                System.out.println(value + " grams is equal to " + result + " kilograms.");
                break;
            case 4:
                System.out.print("Enter value in kilograms: ");
                value = scanner.nextDouble();
                result = convertToGrams(value);
                System.out.println(value + " kilograms is equal to " + result + " grams.");
                break;
            case 5:
                System.out.print("Enter value in Fahrenheit: ");
                value = scanner.nextDouble();
                result = convertToCelsius(value);
                System.out.println(value + " Fahrenheit is equal to " + result + " Celsius.");
                break;
            case 6:
                System.out.print("Enter value in Celsius: ");
                value = scanner.nextDouble();
                result = convertToFahrenheit(value);
                System.out.println(value + " Celsius is equal to " + result + " Fahrenheit.");
                break;
            default:
                System.out.println("Invalid option chosen.");
        }

        scanner.close();
    }
}
