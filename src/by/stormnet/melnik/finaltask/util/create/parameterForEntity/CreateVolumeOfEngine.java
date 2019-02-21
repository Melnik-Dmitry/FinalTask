package by.stormnet.melnik.finaltask.util.create.parameterForEntity;

import java.util.Random;

public class CreateVolumeOfEngine implements CreateParameter {

    @Override
    public Double createParameter() {

        return (new Random().nextDouble() + 0.9);
    }
}
