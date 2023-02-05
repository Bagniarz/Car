package factoryMethodCar.cars.carParts.body.door;

public class CarDoor implements Door {
    private final Location location;
    private boolean opened;

    public CarDoor(Location location, boolean opened) {
        this.location = location;
        this.opened = opened;
    }

    @Override
    public Location getDoorLocation() {
        return location;
    }

    @Override
    public boolean isOpen() {
        return opened;
    }

    @Override
    public void open() {
        opened = true;
    }

    @Override
    public void close() {
        opened = false;
    }
}

