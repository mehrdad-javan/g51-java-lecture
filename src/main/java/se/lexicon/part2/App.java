package se.lexicon.part2;

public class App {

    public static void main(String[] args) {
        // How to call a static method: ClassName.methodName()
        /*
        int result = MathOperations.addition(10, 1); // 11
        System.out.println(result); // Output: 11

        System.out.println(MathOperations.addition(10.5, 1.5));
        */

        // How to Call an instance method: objectName.methodName()
        // How to create Objects in Java: ?
        Car car1 = new Car();
        car1.id = "ABC-123";
        car1.brand= "Volvo";
        car1.year = 2024;
        System.out.println(car1.getCarInfo());


        Car.incrementCounter(); // ClassName.staticMethodName  -> counter = 1
        System.out.println(Car.counter); // ClassName.staticFieldName -> Output = 1



        Car car2 = new Car();
        car2.id= "AAA-222";
        car2.brand = "VW";
        System.out.println(car2.getCarInfo());


        Car.incrementCounter();  // -> counter = 2
        System.out.println(Car.counter); // Output: 2







    }

}
