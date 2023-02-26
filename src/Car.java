public class Car<D extends CarDriver> {
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numSeats;
    private boolean hasSummerTires;
    private String tireType;
    private int numberOfSeats;
    private String model;
    private String mark;

    public <CarLicenseB> Car(String mark, String model, double engineCapacity) {
        super();
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numSeats = numSeats;
        this.hasSummerTires = hasSummerTires;
    }

    public static String getModel() {
        return null;
    }

    public void changeToWinterTires() {
        System.out.println("Changing " + this.mark + " " + this.model + " to winter tires");
        this.hasSummerTires = false;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public String getDriverName() {
        return null;
    }

    public String getBrand() {
        return null;
    }

    public enum CarBodyType {
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        UNIVERSAL("Universal"),
        SUV("SUV"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Minivan");

        private String description;

        CarBodyType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Body type: " + this.name() + ", Description: " + description;
        }
    }

}
