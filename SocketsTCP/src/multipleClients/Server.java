/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleClients;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Martinez
 */
public class Server {

    private ServerSocket serverSocket;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while (true) {
            new EchoClientHandler(serverSocket.accept()).start();
        }
    }

    public void stop() {
        try {
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start(444);
        server.stop();
    }

    private static class EchoClientHandler extends Thread {

        private Socket clientSocket;
        private DataOutputStream out;
        private DataInputStream in;
        
        public EchoClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            try {
                in = new DataInputStream(clientSocket.getInputStream());
                out = new DataOutputStream(clientSocket.getOutputStream());               

                String inputLine;
                while ((inputLine = in.readUTF()) != null) {
                    
                    String cad[] = inputLine.split(";");
                    
                    if(cad.length>1)
                    {
                        int x = Integer.parseInt(cad[1]);
                        int y = Integer.parseInt(cad[2]);
                        
                        int sum = x+y;
                        
                        out.writeUTF(cad[0]+" "+sum);
                    }
                    if (".".equals(inputLine)) {
                        out.writeUTF("bye");
                        break;
                    }
                    out.writeUTF(inputLine);
                }

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {

                    in.close();
                    out.close();
                    clientSocket.close();

                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
