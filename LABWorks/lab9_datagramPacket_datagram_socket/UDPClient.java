package lab9_datagramPacket_datagram_socket;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        String msg = "Hello, server I am Client!";
        InetAddress sAddress = InetAddress.getByName("localhost");
        int sPort = 5000;
        int ByteSize = 1024;

        DatagramSocket cs = new DatagramSocket();
        cs.setSoTimeout(5000);
        cs.setSendBufferSize(ByteSize);
        cs.setReceiveBufferSize(ByteSize);

        byte[] sData = msg.getBytes();
        DatagramPacket sPac = new DatagramPacket(sData, sData.length, sAddress, sPort);
        cs.send(sPac);

        byte[] rcvData = new byte[ByteSize];
        DatagramPacket rcvP = new DatagramPacket(rcvData, rcvData.length);
        cs.receive(rcvP);

        String resp = new String(rcvP.getData(), 0, rcvP.getLength());
        System.out.println("Server response: " + resp);

        cs.close();
    }
}