public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2.5);
        Transport truck = new Trucks("Mercedes-Benz", "Actros") {
            @Override
            public void race() {

            }

            @Override
            public void printType() {

            }

            @Override
            protected String getType() {
                return null;
            }
        };
        Transport bus = new Bus("Scania", "Touring", 10, 80) {
            @Override
            public void race() {

            }

            @Override
            public void printType() {

            }

            @Override
            public void openDoor() {

            }
        };

        try {
            car.passDiagnostics();
            truck.passDiagnostics();
            bus.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }
    }
}