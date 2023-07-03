package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Vector;

public class HiloServidor implements Runnable{
    //Declaramos las variables que utiliza el hilo para estar recibiendo y mandando mensajes
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    
    public static int si=0;
    public static String comnom = "";
    
    //Lista de los usuarios conectados al servidor
    private Vector<Socket> usuarios = new Vector<Socket>();
    
    private Vector<String> nombres_v = new Vector<>();
    
    //Constructor que recibe el socket que atendera el hilo y la lista de los clientes conectados
    public HiloServidor(Socket soc,Vector users, Vector nombres){
        socket = soc;
        usuarios = users;
        nombres_v= nombres;        
    }
    
    
    @Override
    public void run() {
        try {
            //Inicializamos los canales de comunicacion
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
                        
            
            //Ciclo infinito que estara escuchando los mensajes de los clientes            
            while(true){
                //Leer los datos que se mandan cuando desde cliente
                String recibidos = in.readUTF();

                String [] mensaje_array = recibidos.split(";");//[0]nombre   [1]mensaje
                
                if(mensaje_array[0].contains("username")){                    
                    String nombre = mensaje_array[1];
                    nombres_v.add(nombre);
                    System.out.println("USUARIO NUEVO "+ nombre);
                }
                
                String nombres_usuarios="all_usernames";
                nombres_usuarios="all_usernames";
                for(int i = 0; i<nombres_v.size();i++){
                    nombres_usuarios+=";"+nombres_v.elementAt(i);
                        }     
                
                do{
                    if(si == 0){
                        nombres_usuarios="all_usernames";
                        for(int i = 0; i<nombres_v.size();i++){
                            nombres_usuarios+=";"+nombres_v.elementAt(i);
                        }
                        si = 2;
                    }
                    else{
                        if(si == 1){
                            for (int i = 0; i < nombres_v.size(); i++){
                                if(comnom == nombres_v.elementAt(i)){
                                    nombres_v.remove(i);
                                }
                            }
                            si = 0;
                            comnom = " ";
                        }
                    }
                }while(si!=3);
                                
                for (Socket usuario : usuarios) {
                    out = new DataOutputStream(usuario.getOutputStream());
                    out.writeUTF(mensaje_array[0]+": "+mensaje_array[1]);
                    
                    if(mensaje_array[0].contains("username")){
                        out.writeUTF(nombres_usuarios);
                    }
                }
            }
        } catch (Exception e) {
            
            //Si ocurre un excepcion lo mas seguro es que sea porque algun cliente se desconecto asi que lo quitamos de la lista de conectados
            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i) == socket){
                    usuarios.remove(i);
                    break;
                } 
            }            
        }
    }
}  