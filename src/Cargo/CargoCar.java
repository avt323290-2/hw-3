package Cargo;

// Функция перевозки грузов
public class CargoCar {

    private boolean isCargo = false; // Указатель, перевозит ли машина груз в данный момент

    public void cargo(boolean isCargo) {

        if (this.isCargo == isCargo) {
            System.out.println("Груз  "+(isCargo ? "в машине" : "снят с машины")+".");
            return;
        }

        this.isCargo = isCargo;
        System.out.println((isCargo ? "Взят груз к перевозке" : "Груз снят")+".");
    }

    @Override
    public String toString() {
        return "Перевозка грузов: "+(this.isCargo ? "совершается" : "не совершается");
    }
}