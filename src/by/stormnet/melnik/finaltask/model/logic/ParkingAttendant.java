package by.stormnet.melnik.finaltask.model.logic;

import by.stormnet.melnik.finaltask.model.entity.Car.Auto;
import by.stormnet.melnik.finaltask.model.entity.CarPark;
import by.stormnet.melnik.finaltask.util.QueueOnCarPark;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ParkingAttendant {


    private void addCar(CarPark carPark, Auto automobile) throws NullPointerException {

        if (carPark == null && automobile == null) {
            throw new NullPointerException ();
        }
        if (carPark.getAmountOfFreeParkingSpaces () > 0) {
            carPark.getAutomobiles ().add ( automobile );
        }
    }

    public void addCarOnCarPark(CarPark carPark, QueueOnCarPark queue, int amountAddedAuto)
            throws NullPointerException {

        if (queue == null) {
            throw new NullPointerException ();
        }


        int a = 0;
        if (amountAddedAuto > queue.getAutomobilesInQueue ().size ()) {
            a = queue.getAutomobilesInQueue ().size ();
            System.out.println ( "There are only " + a + " automobiles in queue." );
        } else {
            a = amountAddedAuto;
        }

        List<Auto> autos = queue.getAutomobilesInQueue ();
        ListIterator<Auto> iter = autos.listIterator ();

        for (int i = 0; i < a; i++) {
            addCar ( carPark, iter.next () );
            if (carPark.getAmountOfFreeParkingSpaces () <= 0) {
                System.out.println ( "CarPark is full" );
                return;
            }
        }
    }

    public void reduceCarFromCarPark(CarPark carPark, int amountReduceddAuto) throws NullPointerException {

        if (carPark == null) {
            throw new NullPointerException ();
        }

        if (amountReduceddAuto > carPark.getAutomobiles ().size ()) {
            System.out.println ( "There are only " + carPark.getAutomobiles ().size () + " on the CarPark" );
            carPark.getAutomobiles ().removeAll ( carPark.getAutomobiles () );
            carPark.getAmountOfFreeParkingSpaces ();
        } else {
            Iterator<Auto> iter = carPark.getAutomobiles ().listIterator ();
            int a = amountReduceddAuto;
            while (a > 0) {
                Auto as = iter.next ();
                iter.remove ();
                a--;
            }
            carPark.getAmountOfFreeParkingSpaces ();
        }
    }
}
