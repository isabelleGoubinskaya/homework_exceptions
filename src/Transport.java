import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Transport {
    private String type;
    private int capacity;
    private List<Mechanic> mechanics;

    public Transport(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.mechanics = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return capacity == transport.capacity && Objects.equals(type, transport.type) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, mechanics);
    }
}
