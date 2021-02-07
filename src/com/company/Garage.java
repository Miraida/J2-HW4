package com.company;

public class Garage<T extends Car> implements TypeOfCar<T> {
    private T inGarage;

    Garage(T inGarage) {
        this.inGarage = inGarage;
    }

    @Override
    public T typeOfCarInGarage() {
        return inGarage;
    }
}
