package factoryMethodCar.cars.carParts.engine;

public interface Engine {
    float getVolume();
    int getPower();
    boolean isOn();
    void turnOn();
    void turnOff();

}
