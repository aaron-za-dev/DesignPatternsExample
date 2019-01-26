package AbstractFactory;

public class Bike implements Vehicle {

    @Override
    public void Move(float speed) {

        System.out.println("La velocidad de la bicicleta es: "+speed+" KM / Hora");

    }

    @Override
    public void Stop() {

        System.out.println("La bicicleta esta frenando...");

    }

}
