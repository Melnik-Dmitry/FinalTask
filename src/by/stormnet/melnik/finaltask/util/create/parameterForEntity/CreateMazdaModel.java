package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import by.stormnet.melnik.finaltask.model.entity.Car.MazdaModel;

import java.util.Random;

public class CreateMazdaModel implements CreateParameter {

    @Override
    public MazdaModel createParameter() {

        return MazdaModel.values()[new Random().nextInt(2)];
    }
}
