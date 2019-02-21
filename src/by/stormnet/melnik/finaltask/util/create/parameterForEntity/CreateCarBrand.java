package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import by.stormnet.melnik.finaltask.model.entity.Car.CarBrand;

import java.util.Random;

public class CreateCarBrand implements CreateParameter {

    @Override
    public CarBrand createParameter() {

        return CarBrand.values() [new Random().nextInt(2)];
    }
}
