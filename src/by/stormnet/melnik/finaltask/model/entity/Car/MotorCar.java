package by.stormnet.melnik.finaltask.model.entity.Car;

import by.stormnet.melnik.finaltask.model.projectException.InvalidParameterException;
import by.stormnet.melnik.finaltask.model.checkparam.CheckVolumeOfEngine;

import java.util.Objects;

public class MotorCar extends Auto {

    public static final double MIN_VOLUME_ENGINE = 0.79;
    public static final double MAX_VOLUME_ENGINE = 2;

    private double volumeOfEngine;
    private boolean isAutomatTransmission;

    public MotorCar() {
    }

    public MotorCar(FuelType fuelType, CarsColor color, double volumeOfEngine, boolean isAutomatTransmission) {
        super(fuelType, color);

        if (new CheckVolumeOfEngine().checkParameter(MIN_VOLUME_ENGINE,MAX_VOLUME_ENGINE, volumeOfEngine)){
            System.out.println("Invalid parameters. Parameters were seted by default");
            return;
        }
        this.volumeOfEngine = volumeOfEngine;
        this.isAutomatTransmission = isAutomatTransmission;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public boolean isAutomatTransmission() {
        return isAutomatTransmission;
    }

    public void setVolumeOfEngine(double volumeOfEngine) throws InvalidParameterException {

        if (new CheckVolumeOfEngine().checkParameter(MIN_VOLUME_ENGINE,MAX_VOLUME_ENGINE, volumeOfEngine)){
            throw  new InvalidParameterException();
        }
        this.volumeOfEngine = volumeOfEngine;
    }

    public void setAutomatTransmission(boolean automatTransmission) {
        isAutomatTransmission = automatTransmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MotorCar)) return false;
        if (!super.equals(o)) return false;
        MotorCar motorCar = (MotorCar) o;
        return Double.compare(motorCar.volumeOfEngine, volumeOfEngine) == 0 &&
                isAutomatTransmission == motorCar.isAutomatTransmission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volumeOfEngine, isAutomatTransmission);
    }

    @Override
    public String toString() {
        return "volumeOfEngine = " + volumeOfEngine + ", isAutomatTransmission = "
                + isAutomatTransmission + ", " + super.toString();
    }
}
