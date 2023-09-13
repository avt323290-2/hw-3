package FogLights;

// Функция противотуманных фар
public class FogLightsCar {

    private boolean fogLightIsOn = false; // Указатель, включены ли фары в данный момент

    public void fogLights(boolean fogLightIsOn) {

        if (this.fogLightIsOn == fogLightIsOn) {
            System.out.println("Противотуманные фары и так уже "+(fogLightIsOn ? "включены" : "выключены")+".");
            return;
        }

        this.fogLightIsOn = fogLightIsOn;
        System.out.println("Противотуманные фары "+(fogLightIsOn ? "включены" : "выключены")+".");
    }

    @Override
    public String toString() {
        return "Противотуманные фары: "+(this.fogLightIsOn ? "включены" : "выключены");
    }
}