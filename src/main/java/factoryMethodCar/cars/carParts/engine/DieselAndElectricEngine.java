package factoryMethodCar.cars.carParts.engine;

import factoryMethodCar.cars.carParts.engine.fuel.FuelType;

public class DieselAndElectricEngine extends DieselEngine{
    public DieselAndElectricEngine(float volume) {
        super(volume);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.DIESEL_ELECTRIC;
    }
}
