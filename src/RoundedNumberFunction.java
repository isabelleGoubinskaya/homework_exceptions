import java.util.function.Function;

public class RoundedNumberFunction {
    public static void main(String[] args) {

        // Implementing the function using an anonymous class
        Function<Double, Long> roundAnonymous = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };

        // Implementing the function using a lambda
        Function<Double, Long> roundLambda = number -> Math.round(number);

        // Testing the functions
        double number = 3.14159;
        System.out.println("Original number: " + number);
        System.out.println("Rounded number using anonymous class: " + roundAnonymous.apply(number));
        System.out.println("Rounded number using lambda: " + roundLambda.apply(number));
    }
}
