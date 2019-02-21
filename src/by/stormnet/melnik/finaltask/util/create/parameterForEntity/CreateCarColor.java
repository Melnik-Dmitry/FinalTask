package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import by.stormnet.melnik.finaltask.model.entity.Car.CarsColor;

import java.util.Random;

public class CreateCarColor implements CreateParameter {

    @Override
    public CarsColor createParameter() {

        return CarsColor.values()[new Random().nextInt(3)];
    }
}
