package by.stormnet.melnik.finaltask.model.entity.Car;

        import java.util.Objects;

public class Volvo extends PassengerCar {

    private VolvoModel model;

    public Volvo() {
    }

    public Volvo(FuelType fuelType, CarsColor color, double volumeOfEngine,
                 boolean isAutomatTransmission, CarBrand brand, VolvoModel model) {
        super(fuelType, color, volumeOfEngine, isAutomatTransmission, brand);
        this.model = model;
    }

    public VolvoModel getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volvo)) return false;
        if (!super.equals(o)) return false;
        Volvo volvo = (Volvo) o;
        return model == volvo.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "Model = " + model + ", "+ super.toString();
    }
}
