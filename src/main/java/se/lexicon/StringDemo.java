package se.lexicon;

public class StringDemo {
    public static void main(String[] args) {
        String firstName = "Mehrdad";
        String lastName = "Javan";
        //String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());

    }

}
