package factoryMethodCar.cars.carParts.engine;

import factoryMethodCar.cars.carParts.engine.fuel.FuelType;

public class GasolineAndGasEngine extends GasolineEngine {

    public GasolineAndGasEngine(float volume) {
        super(volume);
    }

    @Override
    public FuelType getFuelType() {
        return FuelType.GASOLINE_LPG;
    }
}
