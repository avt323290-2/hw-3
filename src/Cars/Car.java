package Cars;

public abstract class Car {

    // Марка, модель, цвет, тип кузова, тип топлива, тип коробки передач
    protected String make, model, color, bodyType, fuelType, transmType;
    protected  int numWeels; // Число колёс
    protected double engineVol; // Объём двигателя
    protected boolean isMoving = false; // Указатель, что машина движется
    protected boolean isInService = false; // Показатель того, что автомобиль находится на ТО
    protected int gearNum = 0; // Нейтральная передача
    protected boolean lightIsOn = false; // Индикатор включения фар
    protected boolean wipersIsOn = false; // Индикатор включения дворников
    protected String moveMode = "Езда по земле"; // Тип движения (полёт, плавание и т.п.)

    public Car(String make, String model, String color, String bodyType, String fuelType, String transmType, int numWeels, double engineVol) {
        this.make       = make;
        this.model      = model;
        this.color      = color;
        this.bodyType   = bodyType;
        this.fuelType   = fuelType;
        this.transmType = transmType;
        this.numWeels   = numWeels;
        this.engineVol  = engineVol;
    }

    // Движение машины
    public void move(boolean isMoving) {

        if (this.isMoving == isMoving) {
            System.out.println("Машина "+(isMoving ? "едет" : "стоит")+".");
            return;
        }

        if (isMoving && this.gearNum != 1) {
            System.out.println("Чтобы машина поехала, включите первую скорость.");
            return;
        }

        if (!isMoving && this.gearNum != 0) {
            System.out.println("Для того, чтобы остановиться, включите нейтралmye. передачу.");
            return;
        }

        this.isMoving = isMoving;
        System.out.println("Машина " + (isMoving ? "начала движение" : "остановилась") + ".");
    }

    // Метод смены метода движения
    public void setMoveMode(String moveMode) {
        this.moveMode = moveMode;
        System.out.println("Машина перешла в режим движения: "+moveMode);
    }

    // Обслуживание машины
    public void service(boolean isInService) {

        if (this.isInService == isInService) {
            System.out.println("Машина и так уже "+(isInService ? "на обслуживании" : "не на обслуживании")+".");
            return;
        }

        this.isInService = isInService;
        System.out.println("Машина "+(isInService ? "на обслуживании" : "в рабочем режиме")+".");
    }

    // Переключение передачи
    public void gearShift(int gearNum) {

        if (this.gearNum == gearNum) {
            System.out.println("Вы остались на той же скорости.");
            return;
        }

        if (gearNum - this.gearNum > 1) {
            System.out.println("Повышать скорость необходимо постепенно. Текущая передача: "+this.gearNum+".");
            return;
        }

        this.gearNum = gearNum;
        System.out.println("Включена "+(gearNum == 0 ? "нейтральная передача" : gearNum+"-я передача")+".");
    }

    // Включение фар
    public void lights(boolean lightIsOn) {

        if (this.lightIsOn == lightIsOn) {
            System.out.println("Фары и так уже "+(lightIsOn ? "включены" : "выключены")+".");
            return;
        }

        this.lightIsOn = lightIsOn;
        System.out.println("Фары "+(lightIsOn ? "включены" : "выключены")+".");
    }

    // Включение дворников
    public void wipers(boolean wipersIsOn) {

        if (this.wipersIsOn == wipersIsOn) {
            System.out.println("Дворники и так уже "+(wipersIsOn ? "включены" : "выключены")+".");
            return;
        }

        this.wipersIsOn = wipersIsOn;
        System.out.println("Дворники "+(wipersIsOn ? "включены" : "выключены")+".");
    }

    // String make, String model, String color, String bodyType, String fuelType, String transmType, int numWeels, double engineVol
    @Override
    public String toString() {
        return "Марка: "+this.make+"\n" +
                "Модель: "+this.model+"\n" +
                "Цвет: "+this.color+"\n" +
                "Тип кузова: "+this.bodyType+"\n" +
                "Тип топлива: "+this.fuelType+"\n" +
                "Тип коробки передач: "+this.transmType+"\n" +
                "Количество колёс: "+this.numWeels+"\n" +
                "Объём двигателя: "+this.engineVol+"\n" +
                "Режим движения: "+this.moveMode+"\n" +
                "Состояние в данный момент времени: " +
                (this.isMoving ? "движется на передаче"+gearNum : "заглушена") + ", " +
                (this.isInService ? "находится на обслуживании" : "в рабочем режиме") + ", " +
                "фары "+(this.lightIsOn ? "включены" : "выключены") + ", " +
                "дворники "+(this.wipersIsOn ? "включены" : "выключены");
    }
}