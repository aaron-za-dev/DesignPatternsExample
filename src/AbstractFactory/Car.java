package AbstractFactory;

public class Car implements Vehicle {

    @Override
    public void Move(float speed) {

        System.out.println("La velocidad del automovil es: "+speed+" KM / Hora");

    }

    @Override
    public void Stop() {

        System.out.println("El automovil esta frenando...");

    }
}
