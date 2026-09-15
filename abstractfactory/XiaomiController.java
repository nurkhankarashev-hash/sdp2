package abstractfactory;

public class XiaomiController implements SmartController {
    @Override
    public void control(SmartDevice device) {
        System.out.print("Приложение Mi Home отправляет сигнал: ");
        device.executeCommand();
    }
}