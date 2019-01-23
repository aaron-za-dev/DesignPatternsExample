import javax.swing.*;

public class Main {

    public static void main (String [] args){

        int option;

        do {

            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n" +
                    "1.- Patron Singleton \n" +
                    "2.- Patron xxx \n" +
                    "0.- Salir de la aplicacion"));

            switch (option){

                case 1: RunSingletonPattern(); break;
                case 2: break;
                case 0: break;
            }


        } while (option != 0);


    }


    private static void RunSingletonPattern(){

        //No se puede realizar una nueva instancia ya que el constructor esta oculto
        //MyConnection c = new MyConnection();

        //Entonces se obtiene la instancia de la conexion mediante el metodo getInstance()
        MyConnection c = MyConnection.getInstance();

        //Mostrar los detalles y estado de la conexion
        JOptionPane.showMessageDialog(null, "Intentando crear la conexion... \n" +
                "Conexion creda, ahora puedes utilizarla para conectarte... \n" +
                "Conectando: "+c.Conectar()+" \n"+
                "Estado de la conexion: "+c.isConected() + "\n" +
                "Desconectando: "+c.Desconectar()+" \n"+
                "Estado de la conexion: "+c.isConected());

    }

}
