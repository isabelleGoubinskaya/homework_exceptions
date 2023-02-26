import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("Driver " + driver3.getName() + " drives bus " + Bus.getModel() + " and will participate in the race.");

        List<Transport> allCars = new ArrayList<>();
        allCars.add(new Car<>("Toyota", "Camry", Arrays.asList("mechanic1", "mechanic2").toString()));
        allCars.add(new Trucks("Volvo", "FH", Arrays.asList("mechanic3", "mechanic4")) {
            @Override
            public void race() {

            }

            @Override
            public void printType() {

            }
        });
        allCars.add(new Bus("MCI", "J4500", Arrays.asList("mechanic5", "mechanic6")) {
            @Override
            public void race() {

            }

            @Override
            public void printType() {

            }

            @Override
            public void openDoor() {

            }
        });
        for (Transport car : allCars) {
            car.Service();
        }
        Mechanic[] mechanics = {
                new Mechanic("Jane", "Smith", "Mechanics, Inc."),
                new Mechanic("Bob", "Johnson", "Auto Fixers, LLC")
        };
        Car car = new Car("BMW", "X5", "12345");


        for (Mechanic mechanic : car.getMechanics()) {
            System.out.println("- " + mechanic.getFullName() + " (" + mechanic.getCompany() + ")");
        }

    }
}
