package Multicast.Add2Numbers;

import java.net.*;

public class ServerSir {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(1234);
            byte[] buffer;
            buffer = new byte[1];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);

            byte[] nums = dp.getData();

            byte[] send = { (byte) (sum & 0xff) };
            DatagramPacket senddp = new DatagramPacket(send, buffer.length, dp.getAddress(), dp.getPort());
            ds.send(senddp);
            ds.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
