import java.util.HashSet;
import java.util.Set;

public class DriverDatabase {
    private Set<String> drivers;

    public DriverDatabase() {
        this.drivers = new HashSet<>();
    }

    public void addDriver(String driverName) {
        if (drivers.add(driverName)) {
            System.out.println("Driver added: " + driverName);
        } else {
            System.out.println("Driver already exists: " + driverName);
        }
    }

    public Set<String> getDrivers() {
        return drivers;
    }
}
