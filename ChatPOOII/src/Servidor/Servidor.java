package Servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Servidor {
    //Inicializamos el puerto
    private final int puerto = 2027;
    //Numero maximo de conexiones
    private final int noConexiones = 10;
    //Creamos una lista de sockets para guardar el socket de cada cliente
    private Vector<Socket> usuarios = new Vector<Socket>();   
    private Vector<String> nombres_v = new Vector<>();
       
   //Funcion para que el servidor empieze a recibir conexiones de clientes
    public void escuchar(){
        try {
            
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            //Ciclo infinito para estar escuchando por nuevos clientes
            System.out.println("Esperando Clientes....");
            while(true){
                    //Cuando un cliente se conecte guardamos el socket en nuestra lista
                    Socket cliente = servidor.accept();
                    //Se agrega el socket a la lista
                    usuarios.add(cliente);                    
                    
                    //Instanciamos un hilo que estara atendiendo al cliente y lo ponemos a escuchar
                    Runnable  run = new HiloServidor(cliente,usuarios, nombres_v);
                    Thread hilo = new Thread(run);
                    hilo.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Funcion main para correr el servidor
    public static void main(String[] args) {
        Servidor servidor= new Servidor();
        servidor.escuchar();
    }
}