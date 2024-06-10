package se.lexicon.part2;

public class Car {

    // Fields

    // Instance fields:
    // Belong to an instance of the class.
    // Each instance has its own copy of instance variables.
    // Accessed using an object of the class.
    String id;
    String brand;
    int year;
    // More fields as needed

    // Static fields:
    // Do not belong to an instance of the class.
    // Used to share data among all instances.
    static int counter = 0;



    // Methods

    // Instance method:
    // Can access both instance and static fields and methods.
    public String getCarInfo() {
        System.out.println(counter); // we can access the static fields and methods inside the instance methods
        return "Id: " + id + " , Brand: " + brand + " , Year: " + year;
    }


    // Static method:
    // Can only access static fields and methods directly.
    public static void incrementCounter() {
        // System.out.println(id); we cannot access the instance fields and methods inside the static methods
        counter++;
    }

}
