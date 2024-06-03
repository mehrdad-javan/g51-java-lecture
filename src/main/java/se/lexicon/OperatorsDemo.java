package se.lexicon;

public class OperatorsDemo {

    public static void main(String[] args) {
        // Assignment Operator
        int number1 = 10;
        int number2 = 5;
        System.out.println(number1); // 10
        System.out.println(number2); // 5
        number1 = number2;
        System.out.println(number1); // 5
        System.out.println(number2); // 5

        // Arithmetic Operators
        int x = 10;
        int y = 5;
        int sum = x + y; // addition
        int difference = x - y; // subtraction
        int multiplication = x * y;
        int quotient = x / y; // Division -> 2
        int remainder = x % y; // modules or remainder
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println(sum);

        // Comparison Operators
        boolean isEqual = x == y;
        System.out.println(isEqual); // false
        System.out.println(x >= y);  // true
        System.out.println(x != y);  // true

        // Increment and Decrement Operators
        int count = 5;
        //count = count + 1;
        System.out.println(++count); // 6


    } // main


} // class
