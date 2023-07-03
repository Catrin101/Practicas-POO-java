package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Cliente implements Runnable {

    //Declaramos las variables necesarias para la conexion y comunicacion
    private Socket cliente;
    private DataOutputStream out;
    private DataInputStream in;
    //El puerto debe ser el mismo en el que escucha el servidor
    private int puerto = 2027;
    //Si estamos en nuestra misma maquina usamos localhost si no la ip de la maquina servidor
    private String host = "localhost";

    private String mensaje;
    private String nombre;//???
    
    JTextArea ventana_texto;

    //Variables JFrame //TODO
    //Constructor recibe como parametro la ventana (Frame), para poder hacer modificaciones sobre los botones
    public Cliente(String nombre_in, JTextArea ventana) {
        try {
            //Creamos el socket con el host y el puerto, declaramos los streams de comunicacion
            cliente = new Socket(host, puerto);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());
            
            nombre = nombre_in;
            
            ventana_texto = ventana;
            out.writeUTF("username"+";"+nombre_in);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {

            //Ciclo infinito, para estar escuchando por los movimientos de los jugadores
            while (true) {
                //Recibimos el mensaje
                mensaje = in.readUTF();
                System.out.println(mensaje);
                ventana_texto.append(mensaje+"\n");
                
                if(mensaje.contains("all_usernames")){
                    String[] usuarios_nuevos = mensaje.split(";");                    
                    
                    for(int i =0; i<usuarios_nuevos.length;i++){
                        System.out.println(usuarios_nuevos[i]);
                    }
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Funcion sirve para enviar mensajes
    public void enviarMensaje(String mensaje_out) {

        try {
            
            out.writeUTF(nombre+";"+mensaje_out);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}