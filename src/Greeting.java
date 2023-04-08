import java.util.function.Consumer;

public class Greeting {
    public static void main(String[] args) {
        // Implement Consumer using an anonymous class
        Consumer<String> greetAnonymous = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello, " + name + "!");
            }
        };
        greetAnonymous.accept("John");

        // Implement Consumer using a lambda expression
        Consumer<String> greetLambda = (name) -> System.out.println("Hello, " + name + "!");
        greetLambda.accept("Jane");
    }
}
