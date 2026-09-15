package factorymethod;

public class Thermostat implements Device {
    @Override 
    public void turnOn(){
        System.out.println("[Thermostat] Термостат включен: температура 22°C.");
    }
    
}
