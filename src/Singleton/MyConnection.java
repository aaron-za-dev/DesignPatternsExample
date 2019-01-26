package Singleton;

public class MyConnection {
    //Declaracion
    private static MyConnection connection;
    private boolean isConnected = false;

    //Constructor privado u oculto para evitar usar el operador new
    private MyConnection() {

        System.out.println("Conexion creda, ahora puedes utilizarla para conectarte...");

    }

    //metodo para ejecutar el constructor si la instancia declarada es == null
    //se utiliza el puntero synchronized para que la instancia pueda
    //ser utilizada desde otros hilos de manera segura
    public static synchronized MyConnection getInstance() {


        if (connection == null) {

            System.out.println("Intentando crear la conexion...");

            connection = new MyConnection();

        } else {

            System.out.println("Conexion ya creada...");
        }

        //retorno de la instancia
        return connection;

    }

    //Metodos de instancia para el ejemplo
    public String Connect(){

        isConnected = true;
        return  "Conexion establecida...";

    }

    public String Disconnect (){

        isConnected = false;
        return "Conexion liberada...";

    }

    public boolean isConected(){

        return isConnected;

    }


}
