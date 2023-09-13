package Cars;

import FuelStation.IFuelStation;
import FuelStation.IFuelStationCleaning;
import FuelStation.IFuelStationFood;

public class Toyota extends Car implements IFuelStation, IFuelStationCleaning, IFuelStationFood {

    static String make = "Toyota";

    public Toyota(String model, String color, String bodyType, String fuelType, String transmissionType, int numWeels, double engineVol) {
        super(make, model, color, bodyType, fuelType, transmissionType, numWeels, engineVol);
    }

    @Override
    public void refuel() {
        System.out.println("Машина "+this.make+" заправилась топливом "+this.fuelType);
    }

    @Override
    public void cleanFrontGlass() {
        System.out.println("Лобовое стекло помыто.");
    }

    @Override
    public void cleanLights() {
        System.out.println("Фары помыты.");
    }

    @Override
    public void cleanMirrows() {
        System.out.println("Зеркала помыты.");
    }

    @Override
    public void eatOnFuelStation() {
        System.out.println("Перекус на автозаправке.");
    }
}