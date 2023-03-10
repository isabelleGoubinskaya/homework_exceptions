import jdk.internal.jimage.BasicImageReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static <Mechanic> void main(String[] args) {

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
        System.out.println("Driver " + driver3.getName() + " drives bus " + Bus.getModel() + " and will participate in the race.");
        Map<Transport, List<Mechanic>> carMechanicsMap = new HashMap<>();
    }
}