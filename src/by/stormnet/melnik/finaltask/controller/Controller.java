package by.stormnet.melnik.finaltask.controller;

import by.stormnet.melnik.finaltask.model.entity.CarPark;
import by.stormnet.melnik.finaltask.model.logic.ParkingAttendant;
import by.stormnet.melnik.finaltask.util.CarParkBuilder;
import by.stormnet.melnik.finaltask.util.QueueOnCarPark;

public class Controller {

    public static void main(String[] args) {
        run ();
    }


    public static void run() {
        QueueOnCarPark queue = new QueueOnCarPark ();
        QueueOnCarPark queue12 = new QueueOnCarPark ();
        CarPark carPark = CarParkBuilder.buildCarParkWithDefaultParam ();
        ParkingAttendant attendant = new ParkingAttendant ();

        attendant.addCarOnCarPark ( carPark, queue, 20 );
        attendant.addCarOnCarPark ( carPark, queue12, 9 );
        attendant.reduceCarFromCarPark ( carPark, 2 );

        System.out.println ( carPark );
    }
}
