package FogLights;
/**
 * Интерфейс IFogLightsCar представляет функциональность для управления
 * передними противотуманными фарами автомобиля.
 */
public interface IFogLightsCar {
    /**
     * Метод fogLights позволяет включать или выключать передние противотуманные фары.
     *
     * @param fogLightIsOn true, чтобы включить передние противотуманные фары;
     *                     false, чтобы выключить их.
     */
    void fogLights(boolean fogLightIsOn);
}
