package AbstractFactory;

public class LandVehicleFactory extends AbstractFactory{

    @Override
    public Vehicle getVehicle(String vehicleType) {

        if (vehicleType.equals("Car")){

            return new Car();

        }
        else if (vehicleType.equals("Bike")) {

            return new Bike();

        }

        return null;

    }

}
