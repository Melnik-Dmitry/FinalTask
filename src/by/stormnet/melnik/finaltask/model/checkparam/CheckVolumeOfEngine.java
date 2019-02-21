package by.stormnet.melnik.finaltask.model.checkparam;

public class CheckVolumeOfEngine implements CheckParameter {

    @Override
    public boolean checkParameter(double firstParam, double secondParam, double chekedParam) {

        return chekedParam <= firstParam || chekedParam > secondParam;
    }
}
