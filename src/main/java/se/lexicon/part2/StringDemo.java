package se.lexicon.part2;

public class StringDemo {

    public static void main(String[] args) {
        StringDemo.ex5();
    }

    public static void ex1() {
        // How to Create Strings:
        String str1 = new String("Hello, World!");
        String str2 = "Hello, World!";

        String str3 = "This is a concatenated string.";
        String str4 = str3.concat(str2);
        System.out.println(str4);
    }

    public static void ex2() {
        String name = "Mehrdad Javan";
        System.out.println(name.length()); // 13
        System.out.println(name.charAt(3)); // r
        System.out.println("-------------");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void ex3() {
        String greeting = "Welcome";
        //System.out.println(greeting.trim());
        System.out.println(greeting.substring(3)); // come
        System.out.println(greeting.substring(1, 5)); // elco
    }

    public static void ex4() {
        String str1 = "nisse";
        String str2 = "Nisse";
        //boolean isEqual = str1.equalsIgnoreCase(str2); // true
        boolean isEqual = str1.equals(str2); // false
        System.out.println(isEqual);
    }

    public static void ex5(){
        String name = "Erik Svensson";
        System.out.println(name.startsWith("Erik")); // true
        System.out.println(name.endsWith("son")); // true
        System.out.println(name.toLowerCase().startsWith("e")); // true
    }


}
