package abstractfactory;

public class XiaomiDevice implements SmartDevice {
    @Override
    public void executeCommand() {
        System.out.println("Устройство Xiaomi выполняет команду по протоколу MiHome.");
    }
}