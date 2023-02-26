public abstract class CarDriver<C> extends Driver<C> {
    public CarDriver(String name, int experience) {
        super(name, Boolean.parseBoolean("B"), experience);
    }
}