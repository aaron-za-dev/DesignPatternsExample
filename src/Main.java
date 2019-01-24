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
                    "0.- Salir de la aplicacion"));

            switch (option){

                case 1: RunSingletonPattern(); break;
                case 2: RunFactoryPattern() ;
                case 0: break;
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

}
