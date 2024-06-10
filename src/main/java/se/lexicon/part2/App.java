package se.lexicon.part2;

public class App {

    public static void main(String[] args) {
        // how to call a static method: ClassName.methodName()
        int result = MathOperations.addition(10, 1); // 11
        System.out.println(result); // Output: 11

        System.out.println(MathOperations.addition(10.5, 1.5));

    }

}
