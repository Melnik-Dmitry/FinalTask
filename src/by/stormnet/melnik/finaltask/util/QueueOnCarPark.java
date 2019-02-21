package by.stormnet.melnik.finaltask.util;

import by.stormnet.melnik.finaltask.model.entity.Car.Auto;
import by.stormnet.melnik.finaltask.util.create.entitycreate.CarCreator;

import java.util.ArrayList;
import java.util.List;

public class QueueOnCarPark {

    public static final int AMOUNT_AUTO = 6;

    private  List<Auto> automobilesInQueue;

    private void setAutomobilesInQueue() {
        automobilesInQueue = new ArrayList<>(AMOUNT_AUTO);

        for (int i = 0; i < AMOUNT_AUTO; i++) {
            automobilesInQueue.add(new CarCreator().createAutomobile());
        }
    }

    public List<Auto> getAutomobilesInQueue() {
        setAutomobilesInQueue();
        return automobilesInQueue;
    }
}
