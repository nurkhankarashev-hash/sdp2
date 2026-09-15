import factorymethod.*;
import abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: FACTORY METHOD ===");
        // Клиент работает только через абстрактные классы/интерфейсы
        DeviceFactory lampFactory = new LampFactory();
        lampFactory.operateDevice();

        DeviceFactory thermostatFactory = new ThermostatFactory();
        thermostatFactory.operateDevice();

        System.out.println("\n=== PART B: ABSTRACT FACTORY ===");
        // Выбираем вендора в одном месте
        SmartHomeFactory vendorFactory = new XiaomiFactory(); 
        
        SmartDevice device = vendorFactory.createDevice();
        SmartController controller = vendorFactory.createController();

        // Проверяем совместимость всей экосистемы
        controller.control(device);
    }
}