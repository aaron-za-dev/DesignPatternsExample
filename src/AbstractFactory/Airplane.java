package AbstractFactory;

public class Airplane implements Vehicle {

    @Override
    public void Move(float speed) {

        System.out.println("El avion esta volando a : "+speed +" KM / Hora");

    }

    @Override
    public void Stop() {

        System.out.println("El avion esta aterrizando...");

    }
}
