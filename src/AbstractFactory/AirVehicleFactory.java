package AbstractFactory;

public class AirVehicleFactory extends AbstractFactory {

    @Override
    public Vehicle getVehicle(String vehicleType) {

        if (vehicleType.equals("AirPlane")){

            return new Airplane();

        }
        else if (vehicleType.equals("SpaceRocket")) {

            return new SpaceRocket();

        }

        return null;

    }
}
