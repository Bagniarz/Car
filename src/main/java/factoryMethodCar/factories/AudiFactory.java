package factoryMethodCar.factories;

import factoryMethodCar.cars.Audi;
import factoryMethodCar.cars.Car;
import factoryMethodCar.cars.carParts.body.BodyType;
import factoryMethodCar.cars.carParts.engine.GasolineEngine;

public class AudiFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Audi(new GasolineEngine(3.0f), BodyType.SEDAN);
    }
}
