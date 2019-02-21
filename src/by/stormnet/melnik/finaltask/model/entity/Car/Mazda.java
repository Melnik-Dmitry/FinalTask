package by.stormnet.melnik.finaltask.model.entity.Car;

import java.util.Objects;

public class Mazda extends PassengerCar {

    private MazdaModel model;

    public Mazda() {
    }

    public Mazda(FuelType fuelType, CarsColor color, double volumeOfEngine,
                 boolean isAutomatTransmission, CarBrand brand, MazdaModel model) {
        super(fuelType, color, volumeOfEngine, isAutomatTransmission, brand);
        this.model = model;
    }

    public MazdaModel getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mazda)) return false;
        if (!super.equals(o)) return false;
        Mazda mazda = (Mazda) o;
        return model == mazda.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "Model = " + model + ", " + super.toString();
    }
}
