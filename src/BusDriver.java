public abstract class BusDriver<C> extends Driver<C> {
    public BusDriver(String name, String experience) {
        super(name, Boolean.parseBoolean("D"), experience);
    }
}