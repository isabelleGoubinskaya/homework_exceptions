import java.util.ArrayList;
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
        HashMap<Car, List<Mechanic>> mechanicsByCar;
        mechanicsByCar = new HashMap<>();
        Car car = new Car("Toyota", "Corolla", 2020);
        List<Mechanic> mechanics = new ArrayList<>();
        mechanicsByCar.put(car, mechanics);
        Car carToFind = new Car("Toyota", "Corolla", 2020);
        List<Mechanic> mechanicsForCar = mechanicsByCar.get(carToFind);

        Object serviceStation = null;
        HashMap<Object, Object> carMechanicsMap = null;
        HashMap<Object, Object> carMechanics = null;
        for (Map.Entry<Object, Object> entry : carMechanics.entrySet()) {
            System.out.println("Car: " + car.getBrand() + " " + car.getModel());
            System.out.println("Mechanics:");
            for (Mechanic mechanic : mechanics) {
                //System.out.println("- " + mechanic.getName() + " " + mechanic.getSurname());
            }
        }



    }
}
