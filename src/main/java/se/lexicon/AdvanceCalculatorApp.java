package se.lexicon;

import java.util.Scanner;

public class AdvanceCalculatorApp {

    public static void displayMenu() {
        System.out.println("Simple Console Calculator");
        System.out.println("Enter a mathematical expression using numbers and operators (+, -, *, /)");
        System.out.println("For example: 8+4-4/2");
        System.out.println("Type 'exit' to quit the calculator");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();

        while (true) {
            System.out.print("Enter your expression: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            try {
                double result = evaluateExpression(userInput);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid expression.");
            }
        }

        scanner.close();
    }

    public static double evaluateExpression(String expression) throws Exception {
        expression = expression.replaceAll("\\s+", "");

        // Evaluate the expression
        return evaluate(expression);
    }

    private static double evaluate(String expression) throws Exception {
        // https://www.w3schools.com/java/java_regex.asp
        // Split the expression into numbers and operators
        String[] parts = expression.split("(?<=[-+*/])|(?=[-+*/])");

        // Initialize result to the first number
        double result = Double.parseDouble(parts[0]);

        // Iterate through the rest of the parts
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            double operand = Double.parseDouble(parts[i + 1]);

            // Apply the operator to the result and operand
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= operand;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }
}
