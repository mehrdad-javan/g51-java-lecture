package se.lexicon;

public class App {

    public static void main(String[] args) {
        // person1
        Person person1 = new Person();
        person1.firstName = "Mehrdad";
        person1.lastName = "Javan";
        person1.displayFullName(); //


        // person2
        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.displayFullName();

        MethodsDemo.displayMenu();
    }

}
