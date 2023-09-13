package Cars;

import FogLights.FogLightsCar;
import FogLights.IFogLightsCar;
import FuelStation.IFuelStation;
import StreetCleaner.IStreetCleanerCar;
import StreetCleaner.StreetCleanerCar;
import Cargo.ICargoCar;
import Cargo.CargoCar;

public class Jeep extends Car
        implements
        IStreetCleanerCar, IFogLightsCar, ICargoCar,
        IFuelStation {

    static String make = "Jeep";
    private StreetCleanerCar streetCleanerCar;
    private FogLightsCar fogLightsCar;
    private CargoCar cargoCar;

    public Jeep(String model, String color, String bodyType, String fuelType, String transmissionType, int numWeels, double engineVol) {
        super(make, model, color, bodyType, fuelType, transmissionType, numWeels, engineVol);
        streetCleanerCar = new StreetCleanerCar();
        fogLightsCar = new FogLightsCar();
        cargoCar = new CargoCar();
    }

    public void cleanStreet(boolean isCleaningStreet) {
        streetCleanerCar.cleanStreet(isCleaningStreet);
    }

    public void fogLights(boolean fogLightIsOn) {
        fogLightsCar.fogLights(fogLightIsOn);
    }

    public void cargo(boolean isCargo) {
        cargoCar.cargo(isCargo);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                streetCleanerCar.toString() + "\n" +
                fogLightsCar.toString() + "\n" +
                cargoCar.toString();
    }

    @Override
    public void refuel() {
        System.out.println("Машина "+this.make+" заправилась топливом "+this.fuelType);
    }
}