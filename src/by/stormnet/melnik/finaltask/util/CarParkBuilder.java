package by.stormnet.melnik.finaltask.util;

import by.stormnet.melnik.finaltask.model.entity.Car.Auto;
import by.stormnet.melnik.finaltask.model.entity.CarPark;

import java.util.List;

public class CarParkBuilder {

    public static CarPark buildCarParkWithDefaultParam() {

        return new CarPark();
    }

    public static CarPark buildCarPark(int amountOfParkingSpaces, List<Auto> automobiles) {
        // тут можно сделать проверку входных параметров
        // если не валидны вовращать null
        return new CarPark(amountOfParkingSpaces, automobiles);
    }

    public static void increaseCarPark(int amountOfParkingSpacesAfterIncrease, CarPark carPark)
            throws NullPointerException {

        if (amountOfParkingSpacesAfterIncrease <= CarPark.START_CAPACITY) {
            System.out.println("Invalid parameter");
        } else if (carPark == null) {
            throw new NullPointerException(); // тут лучше не кидать исключение
            // а просто не увеличивать тогда парковку с сообщением в лог/консоль
            // а метод может вовращать true/false в 3ависимости от того получилось ли увеличить парковку
            // чтобы в месте вы3ова можно было видеть ре3ультат
        }

        carPark.setAmountOfParkingSpaces(amountOfParkingSpacesAfterIncrease);
    }
}

