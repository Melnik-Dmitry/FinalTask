package by.stormnet.melnik.finaltask.util;

import by.stormnet.melnik.finaltask.model.entity.Car.Auto;
import by.stormnet.melnik.finaltask.model.entity.CarPark;

import java.util.List;

public class CarParkBuilder {

    public static CarPark buildCarParkWithDefaultParam() {

        return new CarPark();
    }

    public static CarPark buildCarPark(int amountOfParkingSpaces, List<Auto> automobiles) {

        return new CarPark(amountOfParkingSpaces, automobiles);
    }

    public static void increaseCarPark(int amountOfParkingSpacesAfterIncrease, CarPark carPark)
            throws NullPointerException {

        if (amountOfParkingSpacesAfterIncrease <= CarPark.START_CAPACITY) {
            System.out.println("Invalid parameter");
        } else if (carPark == null) {
            throw new NullPointerException();
        }

        carPark.setAmountOfParkingSpaces(amountOfParkingSpacesAfterIncrease);
    }
}

