import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class lab8_ssl_server_socket_cipher_suites {
    public static void main(String[] args) {
        try {
            SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sso = (SSLSocket) ssf.createSocket("google.com", 80);

            System.out.println("Retriving CipherSuites From: " + sso.getRemoteSocketAddress());

            System.out.println("Supported Cipher Suites:");
            String[] SupportedCipherSuites = sso.getSupportedCipherSuites();
            for (int i = 0; i < SupportedCipherSuites.length; i++) {
                System.out.println(SupportedCipherSuites[i]);
            }
            System.out.println("Enabled Cipher Suites:");
            String[] EnabledCipherSuites = sso.getEnabledCipherSuites();
            for (int i = 0; i < EnabledCipherSuites.length; i++) {
                System.out.println(EnabledCipherSuites[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}