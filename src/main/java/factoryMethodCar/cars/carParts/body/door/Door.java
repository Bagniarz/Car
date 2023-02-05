package factoryMethodCar.cars.carParts.body.door;

public interface Door {
    Location getDoorLocation();
    boolean isOpen();
    void open();
    void close();
}
