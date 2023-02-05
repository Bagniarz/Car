package factoryMethodCar.factories;

import factoryMethodCar.cars.Car;
import factoryMethodCar.cars.Mercedes;
import factoryMethodCar.cars.carParts.body.BodyType;
import factoryMethodCar.cars.carParts.engine.DieselEngine;

public class MercedesFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Mercedes(new DieselEngine(3.0f), BodyType.SPORT);
    }
}
