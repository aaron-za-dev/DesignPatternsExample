package AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory (String factoryType){

        if (factoryType.equals("AirVehicleFactory")){
            return new AirVehicleFactory();
        }
        else if(factoryType.equals("LandVehicleFactory")){
            return new LandVehicleFactory();
        }

        return null;

    }

}
