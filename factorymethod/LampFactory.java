package factorymethod;

public class LampFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        return new Lamp();
    }
}