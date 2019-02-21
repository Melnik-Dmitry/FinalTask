package by.stormnet.melnik.finaltask.model.checkparam;

public class CheckAmountAvto implements CheckParameter {

    @Override
    public boolean checkParameter(double firstParam, double secondParam, double chekedParam) {

        return chekedParam <= firstParam || chekedParam > secondParam;
    }
}
