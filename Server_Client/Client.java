package Server_Client;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 8000);
            String input;
            String output = "Hello From Client!";
            DataInputStream dis = new DataInputStream(client.getInputStream());
            input = dis.readUTF();
            System.out.println("Data From Server: " + input);
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            dos.writeUTF(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}