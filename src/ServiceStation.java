import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation() {
        queue = new LinkedList<>();
    }

    public void addCarToQueue(Transport transport) {
        queue.add(transport);
        System.out.println("Car " + transport.getNumber() + " added to the queue for maintenance.");
    }

    public void carCheckup() {
        if (queue.isEmpty()) {
            System.out.println("No cars in the queue.");
            return;
        }

        Transport transport = queue.peek();
        if (transport instanceof Bus) {
            System.out.println("Buses do not need maintenance before arrival and do not queue.");
            return;
        }

        Mechanic[] mechanics = transport.getMechanics();
        System.out.println("Car " + transport.getNumber() + " is being serviced by the following mechanics:");
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + ", " + mechanic.getCompany());
        }

        System.out.println("Car " + transport.getNumber() + " has passed maintenance and was removed from the queue.");
        queue.remove();
    }
}
