package factorymethod;

public class DoorLock implements Device {
    @Override 
    public void turnOn(){
        System.out.println("[DoorLock] Умный замок заблокирован.");
    }
    
}
