package factoryMethodCar.cars;

import factoryMethodCar.cars.carParts.body.Body;
import factoryMethodCar.cars.carParts.body.BodyType;
import factoryMethodCar.cars.carParts.engine.Engine;

public class Mercedes implements Car{

    private final Engine engine;
    private final BodyType body;

    public Mercedes(Engine engine, BodyType body) {
        this.engine = engine;
        this.body = body;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating!");
    }

    @Override
    public void brake() {
        System.out.println("Car is slowing down");
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Body getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "engine=" + engine +
                ", body=" + body +
                '}';
    }
}

