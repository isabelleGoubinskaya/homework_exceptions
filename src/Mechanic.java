public class Mechanic {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public void carryOutMaintenance() {
        System.out.println(name + " " + surname + " from " + company + " is carrying out maintenance");
    }

    public void fixCar(Car car) {
        System.out.println(name + " " + surname + " from " + company + " is fixing " + car.getMark() + " " + car.getModel());
        car.setMaintenanceDone(true);
    }

    public String getFullName() {
        return null;
    }

    public String getCompany() {
        return null;
    }

    public boolean getName() {
        return false;
    }

    public Object getSurname() {
        return null;
    }
}
