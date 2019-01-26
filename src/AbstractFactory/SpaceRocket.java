package AbstractFactory;

public class SpaceRocket implements Vehicle {

    @Override
    public void Move(float speed) {

        System.out.println("El cohete espacial esta volando a : "+speed +" KM / Hora");

    }

    @Override
    public void Stop() {

        System.out.println("El cohete espacial esta aterrizando...");

    }
}
