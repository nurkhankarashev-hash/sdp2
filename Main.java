import factorymethod.*;
import abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: FACTORY METHOD ===");
        DeviceFactory lampFactory = new LampFactory();
        lampFactory.operateDevice();

        DeviceFactory thermostatFactory = new ThermostatFactory();
        thermostatFactory.operateDevice();

        System.out.println("\n=== PART B: ABSTRACT FACTORY ===");
        SmartHomeFactory vendorFactory = new XiaomiFactory(); 
        
        SmartDevice device = vendorFactory.createDevice();
        SmartController controller = vendorFactory.createController();

        controller.control(device);
    }
}