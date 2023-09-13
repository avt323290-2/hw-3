/*
Спроектировать абстрактный класс «Cars.Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
Создать конкретный автомобиль путём наследования класса «Cars.Car».
Расширить абстрактный класс «Cars.Car», добавить метод: подметать улицу. Создать конкретный автомобиль путём наследования класса «Cars.Car». Провести проверку принципа SRP.
Расширить абстрактный класс «Cars.Car», добавить метод: включение противотуманных фар, перевозка груза. Провести проверку принципа OCP.
Создать конкретный автомобиль путём наследования класса «Cars.Car», определить число колёс = 3. Провести проверку принципа LSP.
*/

import Cars.Jeep;
import Cars.Toyota;
/**
 * Класс Main представляет собой точку входа в приложение, где создаются экземпляры
 * различных типов автомобилей и выполняются операции заправки.
 */
public class Main {
    public static void main(String[] args) {

        // Создание экземпляра седана Toyota
        Toyota toyota = new Toyota("Camry", "blue", "sedan", "petrol", "auto", 3, 2.5);
        // Создание экземпляра внедорожника Jeep
        Jeep kamaz = new Jeep("Grand Cherokee", "orange", "track", "diesel", "manual", 6, 6);

        // Вызов метода заправки для седана Toyota
        toyota.refuel();
        // Вызов метода заправки для внедорожника Jeep
        kamaz.refuel();
    }
}