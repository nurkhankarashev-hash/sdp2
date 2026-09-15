package abstractfactory;

public class HaierFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createDevice() {
        return new HaierDevice();
    }

    @Override
    public SmartController createController() {
        return new HaierController();
    }
}