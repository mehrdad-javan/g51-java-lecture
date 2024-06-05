package se.lexicon;


import java.util.Scanner;

public class CalculatorApp {

    // ctrl + alt + L
    // it is used to re-format the code.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            displayMenu();
            int operationType = scanner.nextInt();

            if (operationType == 5) {
                System.out.println("Exiting the calculator application.");
                break;
            }
            double result = performOperation(operationType);
            System.out.println("Result: " + result);
        } while (true);

        System.out.println("GoodBye!");

    }

    public static void displayMenu() {
        System.out.println("Select Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");

    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        return number;
    }

    public static double performOperation(int operationType) {

        double result = 0;

        switch (operationType) {
            case 1:
                result = addition();
                break;
            case 2:
                result = subtraction();
                break;
            case 3:
                result = multiplication();
                break;
            case 4:
                result = division();

                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }

        return result;

    }

    public static double addition() {
        return getNumber() + getNumber();
    }

    public static double subtraction() {
        return getNumber() - getNumber();
    }

    public static double multiplication() {
        return getNumber() * getNumber();
    }

    public static double division() {
        return getNumber() / getNumber();
    }

}
