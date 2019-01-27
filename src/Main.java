import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import AbstractFactory.Vehicle;
import Facade.PostMaker;
import Factory.ISocialNetwork;
import Factory.SocialNetworkFactory;
import Singleton.MyConnection;

import javax.swing.*;

public class Main {

    public static void main (String [] args){

        int option;

        do {

            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n" +
                    "1.- Patron Singleton \n" +
                    "2.- Patron Fabrica \n" +
                    "3.- Patron Fabrica Abstracta \n" +
                    "4.- Patron Fachada \n" +
                    "0.- Salir de la aplicacion"));

            switch (option){

                case 1: RunSingletonPattern(); break;
                case 2: RunFactoryPattern() ;
                case 3: RunAbstractFactoryPattern(); break;
                case 4:
                    RunFacadePattern();
                    break;
                case 0: break;
                default: JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion valida"); break;
            }


        } while (option != 0);


    }


    private static void RunSingletonPattern(){

        //No se puede realizar una nueva instancia ya que el constructor esta oculto
        //Singleton.MyConnection c = new Singleton.MyConnection();

        //Entonces se obtiene la instancia de la conexion mediante el metodo getInstance()
        MyConnection c = MyConnection.getInstance();

        //Mostrar los detalles y estado de la conexion
        JOptionPane.showMessageDialog(null, "Intentando crear la conexion... \n" +
                "Conexion creda, ahora puedes utilizarla para conectarte... \n" +
                "Conectando: "+c.Connect()+" \n"+
                "Estado de la conexion: "+c.isConected() + "\n" +
                "Desconectando: "+c.Disconnect()+" \n"+
                "Estado de la conexion: "+c.isConected());

    }

    private static void RunFactoryPattern(){

        String post = "Estamos probando el patron Factory desde Java";
        String desc = "Esta es mi nueva foto de perfil :D";

        //Creamos la fabrica de redes sociales
        SocialNetworkFactory snf = new SocialNetworkFactory();

        //Para publicar en facebook, creamos una instancia de facebook desde la fabrica
        ISocialNetwork fb = snf.getSocialNetwork("Facebook");
        //actualizamos el estado en facebook
        fb.makePost(post);
        System.out.println("--------------------------------------------------------------");

        //actualizamos la foto de perfil
        fb.makePost("media_set?set=a.143510639325234&type=3", desc);
        System.out.println("--------------------------------------------------------------");

        //Para publicar en twitter, creamos una instancia de twitter desde la fabrica
        ISocialNetwork tw = snf.getSocialNetwork("Twitter");
        //publicamos un tweet
        tw.makePost(post);
        System.out.println("--------------------------------------------------------------");

        //Para publicar en Instagram, creamos una instancia de Instagram desde la fabrica
        ISocialNetwork ig = snf.getSocialNetwork("Instagram");

        //Error, metodo no implementado ya que en instagram solo se puede publicar multimedia
        //ig.makePost(post);

        //En su lugar, llamamos al metodo makePost() pasando la url de una imagen, y la descripcion
        ig.makePost("p/Bs-7htzA1Pe3Az/", post);
        System.out.println("--------------------------------------------------------------");

    }

    private static void RunAbstractFactoryPattern(){

        //Cabecera Vehiculos Aereos
        System.out.println("********************** Vehiculos Aereos ************************ \n");

        //Creamos una fabrica que fabrica fabricas de vehiculos aereos
        AbstractFactory avf = FactoryProducer.getFactory("AirVehicleFactory");
        //Creamos un avion (de tipo vehiculo) que fabrico la fabrica de vehiculos aereos
        Vehicle myAirPlane = avf.getVehicle("AirPlane");
        //Cabecera del avion
        System.out.println("------- Mi Avion -------");
        //Se pone en movimiento el avion
        myAirPlane.Move(1000f);

        //Creamos un cohete espacial (de tipo vehiculo) que fabrico la fabrica de vehiculos aereos
        Vehicle myRocket = avf.getVehicle("SpaceRocket");
        //Cabecera del cohete espacial
        System.out.println("------- Mi Cohete Espacial -------");
        //Se pone en movimiento el cohete
        myRocket.Move(350000);
        //Detenemos ambos vehiculos aereos
        myAirPlane.Stop();
        myRocket.Stop();

        //Cabecera Vehiculos Aereos
        System.out.println("********************** Vehiculos Terrestres ************************ \n");
        //Creamos una fabrica que fabrica fabricas de vehiculos terrestres
        AbstractFactory lvf = FactoryProducer.getFactory("LandVehicleFactory");
        //Creamos un carro (de tipo vehiculo) que fabrico la fabrica de vehiculos terrestres
        Vehicle myCar = lvf.getVehicle("Car");
        //Cabecera del carro
        System.out.println("------- Mi Carro -------");
        //Se pone en movimiento el carro
        myCar.Move(90);

        //Creamos una bicicleta (de tipo vehiculo) que fabrico la fabrica de vehiculos terrestres
        Vehicle myBike = lvf.getVehicle("Bike");
        //Cabecera de la bicicleta
        System.out.println("------- Mi Bicicleta -------");
        //Se pone en movimiento la bicicleta
        myBike.Move(10);
        //Detenemos ambos vehiculos terrestres
        myCar.Stop();
        myBike.Stop();

    }

    private static void RunFacadePattern() {

        //Creamos una nueva instancia del Elaborador De publicaciones para acceder a los distintos tipos de publicaciones
        PostMaker pm = new PostMaker();

        System.out.println("***** Facebook *****");
        //Publicacion de estado y fotografia en facebook
        pm.UpdateStatusOnFacebook("Probando el patron fachada");
        pm.UploadPictureToFacebook("#Selfie! :D", "img/00/00/1/!.jpg");

        System.out.println("***** Twitter *****");
        //Publicacion de estado y fotografia en twitter
        pm.UpdateStatusOnTwitter("Estamos probando el patron fachada... :D");
        pm.UploadPictureToTwitter("De Viaje!..", "img/01/02/5/!.jpg");

        System.out.println("***** Instagram *****");
        //Publicacion imagen en Instagram
        pm.UploadPictureToInstagram("Mi desayuno!..", "img/02/03/6/!.jpg");

    }



}
