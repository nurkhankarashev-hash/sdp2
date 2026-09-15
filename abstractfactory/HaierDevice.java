package abstractfactory;

public class HaierDevice implements SmartDevice {
    @Override
    public void executeCommand() {
        System.out.println("Устройство Haier выполняет команду по протоколу evo/Smart Home.");
    }
}