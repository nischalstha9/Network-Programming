# Cipher Suites

## Introduction

> To make the communication between client and server secure, the following parameters are required.
>
> 1. Authentication
> 2. Symmetric encryption
> 3. Hashing algorithm
> 4. Key exchange protocol

### 1. Authentication

To connect to any server client must be able to verify server's identity.

### 2. Symmetric encryption

For transformation of both data the confidentiality must be maintined between client and server.

### 3. Hashing Algorithm

For data encryption hashing algorithm is used within mac address.

### 4. Key exchange protocol

Generation of necessary keys to maintain protocol for the communicaton between server and client.

## Cipher Suites methods

1. getEnableCipherSuites()
2. getSupportedCipherSuites()
3. getRemoteSocketAddress()

## Syntax:

```
	Socket socket = new Socket(8000);
	SSLSocketFactory ssf = SSLSocketFactory.getDefault();
	SSLSocket sso = ssf.createSocket();
	sso.connect(new InetSocketAddress("http://localhost", 8000));
	sysout(sso.getEnabledCipherSuites());
	sysout(sso.getSupportedCipherSuites());
	sysout(sso.getRemoteSocketAddress());
```
