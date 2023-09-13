/**
 * Интерфейс IStreetCleanerCar представляет функциональность для управления
 * уборкой улицы с использованием специализированного автомобиля.
 */
package StreetCleaner;

public interface IStreetCleanerCar {
    /**
     * Метод cleanStreet позволяет начать или завершить процесс уборки улицы
     * с использованием автомобиля-уборщика.
     *
     * @param cleanOn true, чтобы начать уборку улицы; false, чтобы завершить ее.
     */
    void cleanStreet(boolean cleanOn);
}