package ru.skypro;



public class Car extends WheelableTransport implements Serviceable, Wheelable, Engineable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("������ ��������  ������");
    }
    @Override
    public void checkEngine() {
        System.out.println("��������� ��������� � ������");
    }

    @Override
    public void check() {
        System.out.println("����������� " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();

    }
}