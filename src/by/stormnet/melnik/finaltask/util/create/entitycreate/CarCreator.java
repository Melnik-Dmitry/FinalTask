package by.stormnet.melnik.finaltask.util.create.entitycreate;

import by.stormnet.melnik.finaltask.model.entity.Car.*;
import by.stormnet.melnik.finaltask.util.create.parameterForEntity.*;

public class CarCreator {

    public Auto createAutomobile (){
        Auto automobile =  null;
        FuelType fuel = new CreateFuelType().createParameter();
        CarsColor color = new CreateCarColor ().createParameter();
        double volumeOfEngine = new CreateVolumeOfEngine ().createParameter();
        CarBrand brand  = new CreateCarBrand().createParameter();

        MazdaModel mazdaModel = null;
        VolvoModel volvoModel = null;
        if (brand.equals(CarBrand.MAZDA)){
            mazdaModel = new CreateMazdaModel().createParameter();
            automobile = new Mazda(fuel,color,volumeOfEngine,false, brand,mazdaModel);
        } else {
            volvoModel = new CreateVolvoModel().createParameter();
            automobile = new Volvo(fuel,color,volumeOfEngine,false, brand,volvoModel);
        }

        return automobile;
    }
}
