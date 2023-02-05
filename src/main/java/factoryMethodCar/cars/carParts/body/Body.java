package factoryMethodCar.cars.carParts.body;

import factoryMethodCar.cars.carParts.body.door.Door;
import factoryMethodCar.cars.carParts.body.wheels.Wheels;

import java.util.List;

public interface Body {
    BodyType getBodyType();
    List<Door> getDoors();
    List<Wheels> getWheels();
    int amountOfDoors();
    int amountOfSeats();
    int amountOfWheels();
}
