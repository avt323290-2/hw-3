/**
 * Интерфейс IFuelStationCleaning предоставляет функциональность для
 * выполнения различных операций по чистке элементов автомобиля на
 * заправочной станции.
 */
package FuelStation;

public interface IFuelStationCleaning {

    // Протирка лобового стекла
    void cleanFrontGlass();

    // Протирка фар
    void cleanLights();

    // Протирка зеркал
    void cleanMirrows();
}