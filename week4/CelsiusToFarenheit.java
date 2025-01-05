package week4;

import java.util.Scanner;

public class CelsiusToFarenheit {
    public double calc1(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double calc2(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        CelsiusToFarenheit converter = new CelsiusToFarenheit();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter!");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converter.calc1(celsius);
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converter.calc2(fahrenheit);
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
