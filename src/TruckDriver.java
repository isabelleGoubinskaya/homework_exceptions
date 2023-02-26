public abstract class TruckDriver<C> extends Driver<C> {
    public TruckDriver(String name, int experience) {
        super(name, Boolean.parseBoolean("C"), experience);
    }
}