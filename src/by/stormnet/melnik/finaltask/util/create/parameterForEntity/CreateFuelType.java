package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import by.stormnet.melnik.finaltask.model.entity.Car.FuelType;

import java.util.Random;

public class CreateFuelType implements CreateParameter {

    @Override
    public FuelType createParameter() {

        return FuelType.values() [new Random().nextInt(2)];
    }
}
