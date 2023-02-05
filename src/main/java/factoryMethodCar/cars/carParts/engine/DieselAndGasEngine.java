package factoryMethodCar.cars.carParts.engine;

import factoryMethodCar.cars.carParts.engine.fuel.FuelType;

public class DieselAndGasEngine extends DieselEngine{
    public DieselAndGasEngine(float volume) {
        super(volume);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL_LPG;
    }
}
