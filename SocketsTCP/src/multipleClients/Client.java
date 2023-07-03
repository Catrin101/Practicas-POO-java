/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. //https://www.baeldung.com/a-guide-to-java-sockets
 */
package multipleClients;

import continuous_comunication.*;
import simple.*;
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Martinez
 */
public class Client {

    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;

    public static void main(String[] args) {

        Client client = new Client();
        
        client.startConnection("127.0.0.1", 444);

        client.startComunication(client);

        client.stopConnection();
    }

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    public String sendMessage(String msg) {
        String resp = "";
        try {
            out.writeUTF(msg);
            resp = in.readUTF();
            return resp;
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resp;
    }
    
    public void startComunication(Client client) {
        String resp1 = client.sendMessage("hello;10;10");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        System.out.println("hello " + resp1);
        System.out.println("world " + resp2);
        System.out.println("! " + resp3);
        System.out.println(". " + resp4);
    }

    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
