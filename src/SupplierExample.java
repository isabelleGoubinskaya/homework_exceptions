import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // Using an anonymous class
        Supplier<Integer> randomNumSupplier = new Supplier<Integer>() {
            Random rand = new Random();
            @Override
            public Integer get() {
                return rand.nextInt(101);
            }
        };
        int randomNum1 = randomNumSupplier.get();
        System.out.println("Random number generated using anonymous class: " + randomNum1);

        // Using a lambda expression
        Supplier<Integer> randomNumSupplier2 = () -> {
            Random rand = new Random();
            return rand.nextInt(101);
        };
        int randomNum2 = randomNumSupplier2.get();
        System.out.println("Random number generated using lambda expression: " + randomNum2);
    }
}
