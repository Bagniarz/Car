package factoryMethodCar.cars;

import factoryMethodCar.cars.carParts.body.Body;
import factoryMethodCar.cars.carParts.engine.Engine;

public interface Car {
    void accelerate();
    void brake();
    Engine getEngine();
    Body getBody();
}
