package abstractfactory;

public class XiaomiFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createDevice() {
        return new XiaomiDevice();
    }

    @Override
    public SmartController createController() {
        return new XiaomiController();
    }
}