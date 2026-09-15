package factorymethod;

public abstract class DeviceFactory {
    public abstract Device createDevice();

    public void operateDevice() {
        Device device = createDevice();
        device.turnOn();
    }
}