package INetAddressWork;

import java.util.Arrays;
import java.net.InetAddress;

public class INetAddressDemo {
    public static void main(String[] arg) {
        try {
            String host = "safanepal.org";
            InetAddress ip1 = InetAddress.getByName(host);
            byte addr[] = { 72, 3, 2, 12 };
            System.out.println("ip1 : " + ip1);
            System.out.println("Address : " + Arrays.toString(ip1.getAddress()));
            System.out.println("Host Address : " + ip1.getHostAddress());
            System.out.println("Host Name : " + ip1.getHostName());
            System.out.println("Canonical Host Name : " + ip1.getCanonicalHostName());
            System.out.println("isAnyLocalAddress : " + ip1.isAnyLocalAddress());
            System.out.println("isLinkLocalAddress : " + ip1.isLinkLocalAddress());
            System.out.println("isLoopbackAddress : " + ip1.isLoopbackAddress());

            InetAddress ip2 = InetAddress.getByAddress(addr);
            System.out.println("ip2 : " + ip2);
            System.out.println("ip2 HostName: " + ip2.getHostName());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}