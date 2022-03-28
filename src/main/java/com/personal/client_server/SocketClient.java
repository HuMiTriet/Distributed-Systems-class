package com.personal.client_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
  public static void execute() {

    try {
      Socket socket = new Socket("localhost", 1300);

      InputStream in = socket.getInputStream();
      DataInputStream din = new DataInputStream(new wrapperDis(in));

      while (din.available() > 0) {
        String recvString = din.readUTF();
        System.out.println(recvString);
      }

      din.close();
      in.close();
      socket.close();
    } catch (UnknownHostException e) {
      System.err.println("Don't know about host: localhost.");
      System.exit(1);
    } catch (IOException e) {
      System.err.println("Couldn't get I/O for the connection to: localhost.");
      System.exit(1);
    }

  }
}
