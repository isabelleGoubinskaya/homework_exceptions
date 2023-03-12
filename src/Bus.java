
public abstract class Bus extends Transport implements Competitor{
    private int passengerCapacity;
    private String fuelType;

    public <C> Bus(String mark, String model, double engineCapacity, Driver<C> driver3) {
        super(mark, model, engineCapacity);
        this.passengerCapacity = passengerCapacity;
        this.fuelType = fuelType;
    }

    @Override
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

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Passenger capacity must be greater than 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public void setFuelType(String fuelType) {
        if (fuelType == null || fuelType.trim().isEmpty()) {
            throw new IllegalArgumentException("Fuel type cannot be null or empty");
        }
        this.fuelType = fuelType;
    }

    public abstract void openDoor();

    public enum CapacityType {
        EXTRA_SMALL("Up to 10 seats"),
        SMALL("Up to 25 seats"),
        MEDIUM("25-50 seats"),
        LARGE("50-80 seats"),
        ESPECIALLY_LARGE("80-120 seats");

        private final String description;

        CapacityType(String description) {
            this.description = description;
        }
    }
}
