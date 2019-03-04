package by.stormnet.melnik.finaltask.model.logic.search;

import by.stormnet.melnik.finaltask.model.entity.Car.Auto;
import by.stormnet.melnik.finaltask.model.entity.CarPark;

import java.util.List;

public class SearchCarWithParameter {

    public static Auto searchCarWithColor(CarPark carPark, Object parameter) throws NullPointerException {
        if (carPark == null) {
            throw new NullPointerException(); // и тут тоже не обя3ательно кидать NullPointerException
            // лучше просто вывод в консоль + логгер и во3врат null
        }
        Auto automobile = null;

        List<Auto> automobiles = carPark.getAutomobiles();
        for (int i = 0; i < automobiles.size(); i++) {
            Auto current = automobiles.get(i);
            if (parameter.toString().equals("FuelType")) {
                if (current.getFuelType().equals(parameter)) {
                    automobile = current;
                }
            } else if (parameter.toString().equals("CarsColor")) {
                if (current.getColor().equals(parameter)) {
                    automobile = current;
                }
            }
        }

        return automobile;
    }
}
