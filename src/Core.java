import Cargo.ICargoCar;
import Cars.Car;
import FogLights.IFogLightsCar;
import StreetCleaner.IStreetCleanerCar;
import java.util.Scanner;
/**
 * Класс Core представляет собой основную логику приложения для управления
 * различными функциями автомобиля на основе введенных команд пользователя.
 */
public class Core {
    /**
     * Метод run выполняет основную логику приложения, обеспечивая взаимодействие
     * пользователя с автомобилем через команды.
     *
     * @param myCar Объект класса Car, представляющий управляемый автомобиль.
     */
    static void run(Car myCar) {

        System.out.println("=============== Инструкция ===============\n" +
                "Вывести информацию о машине: info\n" +
                "Для управления машиной используйте следующие команды:\n" +
                "  • переключение передачи: просто цифра\n" +
                "  • начать движение / остановиться: go / stop\n" +
                "  • встать на обслуживание / закончить обслуживание: service on / service off\n" +
                "  • включить/выключить фары: lights on / lights off\n" +
                "  • включить/выключить дворники: wipers on / wipers off\n" +
                "  • сменить режим движения: move <Режим движения>");

        if (myCar instanceof IStreetCleanerCar) {
            System.out.println("  • начать/закончить уборку улицы: clean on / clean off");
        }

        if (myCar instanceof IFogLightsCar) {
            System.out.println("  • включить/выключить противотуманные фары: foglights on / foglights off");
        }

        if (myCar instanceof ICargoCar) {
            System.out.println("  • взять/снять груз к перевозке: cargo on / cargo off");
        }

        System.out.println("Выход из программы: exit");

        System.out.println("\n=============== Старт ===============");

        Scanner sc = new Scanner(System.in);
        String cmd;

        while (true) {

            System.out.print("Введите команду: ");

            cmd = sc.nextLine().trim().toLowerCase();

            // Выход из программы
            if (cmd.equals("exit")) {
                System.out.println("\n=============== Выход ===============");
                break;
            }

            // Информация о машине
            if (cmd.equals("info")) {
                System.out.println(myCar);
                continue;
            }

            // Переключение скорости
            if (cmd.matches("\\d+")) {
                myCar.gearShift(Integer.parseInt(cmd));
                continue;
            }

            // Движение
            if (cmd.equals("go") || cmd.equals("stop")) {
                myCar.move(cmd.equals("go"));
                continue;
            }

            // Обслуживание
            if (cmd.equals("service on") || cmd.equals("service off")) {
                myCar.service(cmd.equals("service on"));
                continue;
            }

            // Фары
            if (cmd.equals("lights on") || cmd.equals("lights off")) {
                myCar.lights(cmd.equals("lights on"));
                continue;
            }

            // Дворники
            if (cmd.equals("wipers on") || cmd.equals("wipers off")) {
                myCar.wipers(cmd.equals("wipers on"));
                continue;
            }

            if (cmd.length() > 5 && cmd.substring(0, 5).equals("move ")) {
                myCar.setMoveMode(cmd.substring(5));
                continue;
            }

            // Уборка улицы
            if (cmd.equals("clean on") || cmd.equals("clean off")) {
                if (myCar instanceof IStreetCleanerCar) {
                    IStreetCleanerCar streetCleanerCar = (IStreetCleanerCar) myCar;
                    streetCleanerCar.cleanStreet(cmd.equals("clean on"));
                }
                else {
                    System.out.println("Функция уборки улиц у машины отсутствует.");
                }
                continue;
            }

            // Противотуманные фары
            if (cmd.equals("foglights on") || cmd.equals("foglights off")) {
                if (myCar instanceof IFogLightsCar) {
                    IFogLightsCar fogLightsCar = (IFogLightsCar) myCar;
                    fogLightsCar.fogLights(cmd.equals("foglights on"));
                }
                else {
                    System.out.println("Противотуманные фары у машины отсутствуют.");
                }
                continue;
            }

            // Перевозка грузов
            if (cmd.equals("cargo on") || cmd.equals("cargo off")) {
                if (myCar instanceof ICargoCar) {
                    ICargoCar cargoCar = (ICargoCar) myCar;
                    cargoCar.cargo(cmd.equals("cargo on"));
                }
                else {
                    System.out.println("Машина не может перевозить грузы.");
                }
                continue;
            }

            System.out.println("Команда не распознана.");
        }
    }
}