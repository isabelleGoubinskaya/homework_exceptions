import java.util.List;

public abstract class Transport<D extends Driver<C>, C> implements Competitor {
    private String mark;
    private static String model;
    private double engineCapacity;
    private D driver;
    private List<Mechanic> mechanics;

    public Transport(String mark, String model, double engineCapacity, D driver) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.mechanics = mechanics;
    }

    public Transport(String mark, String model, double engineCapacity) {
    }

    protected Transport() {
    }

    public void start() {
        System.out.println("Starting " + this.mark + " " + this.model);
    }

    public void stop() {
        System.out.println("Stopping " + this.mark + " " + this.model);
    }

    public void fillUp() {
        System.out.println("Filling up " + this.mark + " " + this.model);
    }

    // Getters and setters
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }

    @Override
    public void pitStop() {
        System.out.println("Performing pit stop for " + this.mark + " " + this.model);
    }

    @Override
    public void bestLapTime() {
        System.out.println("Calculating best lap time for " + this.mark + " " + this.model);
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Calculating maximum speed for " + this.mark + " " + this.model);
    }

    public abstract void race();
    protected Type type;

    public Transport(Type type) {
        this.type = type;
    }

    public abstract void printType();

    protected String getTypeString() {
        return type != null ? type.toString() : "Insufficient vehicle data";
    }
    public void Service() {

    }

    public void setMaintenanceDone(boolean b) {
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public Mechanic[] getMechanics() {
        return new Mechanic[0];
    }

    public String getNumber() {
        return null;
    }
}
