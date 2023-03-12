import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static <C> void main(String[] args) {
        HashSet<Driver<C>> drivers = new HashSet<>();

        Driver<C> driver1 = new Driver<C>("John Smith", 35, "ABC123");
        Driver<C> driver2 = new Driver<C>("Jane Doe", 27, "XYZ456");
        Driver<C> driver3 = new Driver<C>("John Smith", 35, "ABC123");

        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        Iterator<Driver<C>> iterator = drivers.iterator();

        while (iterator.hasNext()) {
            Driver<C> driver = iterator.next();
            System.out.println(driver.getName() + ", " + driver.getAge() + ", " + driver.getLicenseNumber());
        }
    }
}
