package factoryMethodCar.cars.carParts.engine;

import factoryMethodCar.cars.carParts.engine.fuel.Fuel;
import factoryMethodCar.cars.carParts.engine.fuel.FuelType;

public class DieselEngine implements Engine, Fuel {
    private boolean on;
    private final int power;
    private final float volume;

    public DieselEngine(float volume) {
         if (volume < 0.8f || volume > 5.0f) {
             this.volume = 1.0f;
             System.err.println("You can't create engine with volume lower than 0.8 and larger than 5.0");
         } else {
             this.volume = volume;
         }
         this.power = (int) volume * 75;
         this.on = false;
    }

    @Override
    public float getVolume() {
        return volume;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "on=" + on +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}
