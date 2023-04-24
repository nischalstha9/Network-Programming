# UDP

## Introduction

1. It provides connectionless unreliable communication.
2. It is fast than TCP
3. UDP is often used when a socket is open in datagram mode.
4. UDP sends data in the bulk quantity.
5. Example: Audio, Video Communication

Syntax:

```
public class DatagramSocket extends Object {

}
```

>

1. Receiving and sending datagram is done with the help of **DatagramSocket** class
2. A class named **DatagramPacket** is a class that is used to send bytes of data into UDP packets
3. The bytes of data sent using UDP packet is called datagram.
4. Class named _DatagramPacket_ is utilized to receive data using it's object.
5. To send data the datagram is set to the object of datagram packet utilizing a packet of DatagramSocket.

### Constructors in DatagramSocket

1. The constructor of DatagramSocket are utilized in sending packets of data.
2. It is also used in opening DatagramSocket for different port.
3. It's constructors are also used to define different local ports on different local networks.
4. The constructors only define local ports.
5. DatagramSocket can send and receive datagram from remote ports and hosts.

Syntax: \
_There are following constructors in DatagramSocket:_

```
public DatagramSocket(int port, InetAddress inet){}
```

> The first parameter defines the port on a local network and the second defines network interface.

```
public DatagramSocket (int port){}
```

> The first parameter defines the port on a local network.

```
public DatagramSocket(InetAddress inet){}
```

> The first parameter defines the network interface

```
public DatagramSocket(){}
```

> Creates socket that is connected to an anonymous (default) port

### Send and receive Datagram

Syntax:

```
public void send(DatagramPacket dp){}
```

> It is used to send data over UDP datagrams.

Syntax:

```
public void receive(DatagramPacket dp){}
```

> It is used to receive data over UDP datagrams.

### InetAddress

Syntax:

```
InetAddress inet = new InetAddress()
inet.getByName("localhost");
DatagramPacket dp = new DatagramPacket(<data_to_send>, <len_of_data_to_send>, <host>, <port>)
<DatagramSocketOBJECT>.send(<data_to_send>)
```
