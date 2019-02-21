package by.stormnet.melnik.finaltask.model.entity.Car;

import java.util.Objects;

public class Auto {

    private FuelType fuelType;
    private CarsColor color;

    public Auto() {
    }

    public Auto(FuelType fuelType, CarsColor color) {
        this.fuelType = fuelType;
        this.color = color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public CarsColor getColor() {
        return color;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setColor(CarsColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return fuelType == auto.fuelType &&
                color == auto.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuelType, color);
    }

    @Override
    public String toString() {
        return "fuelType = " + fuelType + ", color = " + color;
    }
}
