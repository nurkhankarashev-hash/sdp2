package abstractfactory;

public class HaierController implements SmartController {
    @Override
    public void control(SmartDevice device) {
        System.out.print("Приложение Haier EVO отправляет сигнал: ");
        device.executeCommand();
    }
}