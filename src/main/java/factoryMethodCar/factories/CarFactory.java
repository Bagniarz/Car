package factoryMethodCar.factories;

import factoryMethodCar.cars.Car;

public abstract class CarFactory {
    public void checkCar() {
        Car car = createCar();
        car.accelerate();
        car.brake();
    }
    public abstract Car createCar();
}

