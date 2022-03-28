package com.personal.client_server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;

public class SocketServer {
  public static boolean run = true;

  public static void execute() throws IOException {
    ServerSocket serverSocket = new ServerSocket(1300);

    Socket socket = serverSocket.accept();

    OutputStream outputStream = socket.getOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

    for (int i = 0; i < 10; i++) {
      dataOutputStream.writeUTF("hello, world!");
    }

    dataOutputStream.close();

    outputStream.close();

    socket.close();

    serverSocket.close();
  }
}
