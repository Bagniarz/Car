package factoryMethodCar.cars.carParts.body.wheels;

import factoryMethodCar.cars.carParts.body.door.Location;

import java.util.List;

public class Wheel implements Wheels {

    private final Location location;
    private final int size;

    public Wheel(Location location, int size) {
        this.location = location;
        this.size = size;
    }

    @Override
    public Location getWheelLocation() {
        return location;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int amountOfWheels(List<Wheels> wheels) {
        return wheels.size();
    }
}
