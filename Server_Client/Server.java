package Server_Client;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8000);
            Socket client;
            System.out.println("waiting for client ...");
            client = server.accept();
            while (true) {
                String output = "Hello From Nischal's Server!";
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                dos.writeUTF(output);
                DataInputStream dis = new DataInputStream(client.getInputStream());
                String input = dis.readUTF();
                System.out.println(input);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}