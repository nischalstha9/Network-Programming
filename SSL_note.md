# SSL

## Importing Secure Socket
1. SecureSocket package can be imported from javax.net.*
2. The class SocketFactory is utilized for creating Secure client sockets
3. The package javax.net is used to abstract socket packet class
4. Initialization of SSL server sockets is done by inheriting methods from ServerSocket

## Event Handlers
1. Do yourself

## HandshakeCompletedEvent
1. It is a class that extends Event from package java.util.EventObject
2. Method named getSession() returns the event of a session

## Session Management
1. It is commonly used on web servers for every single page that requires socket
2. It helps in editing or choosing different sockets
3. Multiple system in a network must agree to establish a connection or session
4. A method setEnableSessionCreation() is used to identify if the conenciton is allowed. This methods returns boolean (true or false).
5. A method getEnableSessionCreation() is used to retrive state if connection is allowed.

## SSLServerSocket Class
1. This class is used for determining if any authentication are required for the conenction between server and client.
2. Method setNeedClientAuth() is used to specify if the connection authentication is required. (returns Boolean)
3. getNeedClientAuth() is used to fetch if connection authentication is required.

## Client mode communication
1. Client don't require any authentication if the server is authenticated by its own.
   For Example: Simple communication between ServerSocket (Server) and Socket (Client)
Syntax:
```
	Socket socket = new Socket(8000);
	SSLSocketFactory ssf = SSLSocketFactory.getDefault();
	SSLSocket sso = ssf.createSocket();
	sso.connect(new InetSocketAddress("http://localhost", 8000));
```
