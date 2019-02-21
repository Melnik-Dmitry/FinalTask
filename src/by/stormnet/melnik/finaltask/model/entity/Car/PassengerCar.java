package by.stormnet.melnik.finaltask.model.entity.Car;

import java.util.Objects;

public class PassengerCar extends MotorCar {

    private CarBrand brand;

    public PassengerCar() {
    }

    public PassengerCar(FuelType fuelType, CarsColor color, double volumeOfEngine,
                        boolean isAutomatTransmission, CarBrand brand) {
        super(fuelType, color, volumeOfEngine, isAutomatTransmission);
        this.brand = brand;
    }

    public CarBrand getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return brand == that.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", " + super.toString();
    }
}
