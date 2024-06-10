package se.lexicon.part2;

public class Car {
    // Fields
    /*
        Instance fields are variables:
            Belong to an instance of the class.
            Each instance has its own copy of instance variables.
            Accessed using an object of the class.

     */

    String id;
    String brand;
    int year;
    // more fields as needed

    /*
    static fields are not belong to an instance of the class.
    they used to share data among all instances.
     */
    static int counter = 0;


    // Methods
    public String getCarInfo() {
        System.out.println(counter); // we can access the static fields and methods inside the instance methods
        return "Id: " + id + " , Brand: " + brand + " , Year: " + year;
    }


    public static void incrementCounter() {
        // System.out.println(id); we cannot access the instance fields and methods inside the static methods
        counter++;
    }

}
