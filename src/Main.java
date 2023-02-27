import jdk.internal.jimage.BasicImageReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Driver driver1 =new Driver("Sergei", true, 3) {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void fillUp() {

            }
        };
        System.out.println("Driver " + driver1.getName() + " drives car " + Car.getModel() + " and will participate in the race.");
        Driver driver2 = new Driver("Misha", true, 5) {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void fillUp() {

            }
        };
        System.out.println("Driver " + driver2.getName() + " drives truck " + Trucks.getModel() + " and will participate in the race.");
        Driver driver3 = new Driver("anna", true, 5) {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void fillUp() {

            }
        };
        Set<String> drivers = new HashSet<>();

        drivers.add("John Smith");
        drivers.add("Jane Doe");
        drivers.add("John Smith");
        drivers.add("Bob Johnson");
        drivers.add("Jane Doe");

        System.out.println("Unique Drivers:");
        Iterator<String> iterator = drivers.iterator();
        while (iterator.hasNext()) {
            String driver = iterator.next();
            System.out.println(driver);
        }
    }
}
