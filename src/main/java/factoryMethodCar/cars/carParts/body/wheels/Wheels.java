package factoryMethodCar.cars.carParts.body.wheels;

import factoryMethodCar.cars.carParts.body.door.Location;

import java.util.List;

public interface Wheels {
    Location getWheelLocation();
    int getSize();
    int amountOfWheels(List<Wheels> wheels);
}

