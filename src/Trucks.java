import java.util.List;

public abstract class Trucks extends Transport implements Competitor{
    private String mark;
    private static String model;
    private double engineCapacity;

    public Trucks() {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    public Trucks(String volvo, String fh, List<String> asList) {
    }

    public void pitStop() {
        System.out.println("Car pit stop");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Car best lap time");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Car maximum speed");
    }

    public String getMark() {
        return mark;
    }

    public static String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    public enum PayloadType {
        N1("Up to 3.5 tons"),
        N2("Over 3.5 to 12 tons"),
        N3("Over 12 tons");

        private String payloadDescription;

        PayloadType(String payloadDescription) {
            this.payloadDescription = payloadDescription;
        }

        public String getPayloadDescription() {
            return payloadDescription;
        }

        @Override
        public String toString() {
            return payloadDescription;
        }
        public void Service() {

        }
    }

}
