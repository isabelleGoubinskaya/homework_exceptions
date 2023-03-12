import java.util.Objects;

public class Driver<C> {
    private String name;
    private int age;
    private String licenseNumber;

    public Driver(String name, int age, String licenseNumber) {
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
    }

    public Driver(String name, boolean d, int experience) {
    }

    public Driver(String name, boolean d, String experience) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Driver)) {
            return false;
        }

        Driver<C> other = (Driver<C>) obj;

        return name.equals(other.name)
                && age == other.age
                && licenseNumber.equals(other.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, licenseNumber);
    }
}
