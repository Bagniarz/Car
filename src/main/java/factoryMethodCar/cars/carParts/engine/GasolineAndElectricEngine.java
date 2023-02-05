package factoryMethodCar.cars.carParts.engine;

import factoryMethodCar.cars.carParts.engine.fuel.FuelType;

public class GasolineAndElectricEngine extends GasolineEngine {
    public GasolineAndElectricEngine(float volume) {
        super(volume);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GASOLINE_ELECTRIC;
    }
}
