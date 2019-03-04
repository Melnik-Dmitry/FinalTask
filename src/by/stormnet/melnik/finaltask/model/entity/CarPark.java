package by.stormnet.melnik.finaltask.model.entity;

import by.stormnet.melnik.finaltask.model.checkparam.CheckAmountAvto;
import by.stormnet.melnik.finaltask.model.entity.Car.Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarPark {

    public static final int START_CAPACITY = 10;

    private int amountOfParkingSpaces;
    private int amountOfFreeParkingSpaces;
    private List<Auto> automobiles;

    public CarPark() {
        amountOfParkingSpaces = START_CAPACITY;
        automobiles = new ArrayList<>(START_CAPACITY);
        amountOfFreeParkingSpaces = amountOfParkingSpaces - automobiles.size();
    }

    public CarPark(int amountOfParkingSpaces, List<Auto> automobiles) throws NullPointerException {
        if (new CheckAmountAvto().checkParameter(0, START_CAPACITY, amountOfParkingSpaces)) {
            System.out.println("Invalid parameters. Parameters were seted by default");
            amountOfParkingSpaces = START_CAPACITY;
            this.automobiles = new ArrayList<>(amountOfParkingSpaces);
            return;
        } else if (automobiles == null) {
            System.out.println("Invalid parameters.");
            this.automobiles = new ArrayList<>();
            throw new NullPointerException(); // тут тоже вместо выброса ошибки
            // лучше проверять валидность параметра ДО вы3ова конструктора
            // в buildCarPark
        }
        this.amountOfParkingSpaces = amountOfParkingSpaces;
        this.automobiles = automobiles;
        amountOfFreeParkingSpaces = amountOfParkingSpaces - automobiles.size();
    }


    public int getAmountOfFreeParkingSpaces() {
        amountOfFreeParkingSpaces = amountOfParkingSpaces - automobiles.size();
        return amountOfFreeParkingSpaces;
    }

    public int getAmountOfParkingSpaces() {
        return amountOfParkingSpaces;
    }

    public List<Auto> getAutomobiles() {
        return automobiles;
    }

    public void setAmountOfParkingSpaces(int amountOfParkingSpaces) {
        this.amountOfParkingSpaces = amountOfParkingSpaces;
    }

    public void setAutomobiles(List<Auto> automobiles) throws NullPointerException {
        if (automobiles == null) {
            throw new NullPointerException();
        }
        this.automobiles = automobiles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarPark)) return false;
        CarPark carPark = (CarPark) o;
        return amountOfFreeParkingSpaces == carPark.amountOfFreeParkingSpaces &&
                automobiles.equals(carPark.automobiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfFreeParkingSpaces, automobiles);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("CarPark {amountOfParkingSpace = " + amountOfParkingSpaces
                + ", amountOfFreeParkingSpaces = " + amountOfFreeParkingSpaces + '\n');

        for (Auto auto : automobiles) {
            builder.append(auto.toString() + '\n');
        }
        builder.append('}');

        return builder.toString();
    }
}
