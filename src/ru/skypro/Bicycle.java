package ru.skypro;

public class Bicycle extends WheelableTransport implements Serviceable, Wheelable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("������ �������� ����������");
    }

    @Override
    public void check() {
            System.out.println("����������� " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++)  {
                updateTyre();
            }


    }
}