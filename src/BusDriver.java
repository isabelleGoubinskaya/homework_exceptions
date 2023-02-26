public abstract class BusDriver<C> extends Driver<C> {
    public BusDriver(String name, int experience) {
        super(name, Boolean.parseBoolean("D"), experience);
    }
}