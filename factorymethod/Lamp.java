package factorymethod;

public class Lamp implements Device{
    @Override 
    public void turnOn(){
        System.out.println("[Lamp] Свет включен с мягкой подсветкой.");
    }
    
}
