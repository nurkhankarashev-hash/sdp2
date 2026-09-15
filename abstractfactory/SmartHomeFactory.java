package abstractfactory;

public interface SmartHomeFactory {
    SmartDevice createDevice();
    SmartController createController();
}