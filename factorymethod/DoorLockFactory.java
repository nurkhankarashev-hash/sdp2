package factorymethod;
public class DoorLockFactory extends DeviceFactory {
    @Override
    public Device createDevice() {
        return new DoorLock();
    }
}