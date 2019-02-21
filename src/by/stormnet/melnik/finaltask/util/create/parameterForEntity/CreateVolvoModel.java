package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import by.stormnet.melnik.finaltask.model.entity.Car.VolvoModel;

import java.util.Random;

public class CreateVolvoModel implements CreateParameter {

    @Override
    public VolvoModel createParameter() {
        return VolvoModel.values() [new Random().nextInt(2)];
    }
}
