public abstract class Driver<C> {
    private String name;
    private String hasLicense;
    private int experience;

    public Driver(String name, boolean hasLicense, int experience) {
        this.name = name;
        this.hasLicense = String.valueOf(hasLicense);
        this.experience = experience;
    }

    public Driver(String name) {
    }

    public String getName() {
        return name;
    }

    public String hasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void fillUp();

}


class BCatDriver<C> extends Driver<C> {
    public BCatDriver(String name, int experience) {
        super(name, Boolean.parseBoolean(String.valueOf(true)), experience);
    }

    @Override
    public void start() {
        System.out.println("Starting passenger car driver " + getName());
    }

    @Override
    public void stop() {
        System.out.println("Stopping passenger car driver " + getName());
    }

    @Override
    public void fillUp() {
        System.out.println("Filling up passenger car driver " + getName());
    }
}

class CCatDriver<C> extends Driver<C> {
    public CCatDriver(String name, int experience) {
        super(name, Boolean.parseBoolean(String.valueOf(true)), experience);
    }

    @Override
    public void start() {
        System.out.println("Starting truck driver " + getName());
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck driver " + getName());
    }

    @Override
    public void fillUp() {
        System.out.println("Filling up truck driver " + getName());
    }
}

class DCatDriver<C> extends Driver<C> {
    public DCatDriver(String name, int experience) {
        super(name, Boolean.parseBoolean(String.valueOf(true)), experience);
    }

    @Override
    public void start() {
        System.out.println("Starting bus driver " + getName());
    }

    @Override
    public void stop() {
        System.out.println("Stopping bus driver " + getName());
    }

    @Override
    public void fillUp() {
        System.out.println("Filling up bus driver " + getName());
    }
}
