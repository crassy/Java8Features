import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /**
         * Imperative.
         */
        int sum = 0;
        for (int i = 0; i <=100; i++){
            sum += i;
        }
        System.out.println("I - Sum is : " + sum);

        /**
         * Declarative.
         */

        int total = IntStream.rangeClosed(0,100).sum();
        System.out.println("D - total is : " + total);
    }
}