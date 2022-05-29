package ru.skypro;


public class Truck extends WheelableTransport implements Serviceable, Wheelable, Engineable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовка");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовка ");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();

    }
}