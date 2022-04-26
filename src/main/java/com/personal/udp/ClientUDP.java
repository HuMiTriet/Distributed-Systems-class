package com.personal.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientUDP {
  public static void main(String[] args) {

    DatagramSocket dgSocket = null;

    String hostName = "localHost";
    int port = 17;

    try {
      dgSocket = new DatagramSocket();
      byte[] bytes = new byte[512];
      InetAddress serverHost = InetAddress.getByName(hostName);
      // int serverPortNumber = Integer.valueOf(args[2]).intValue();

      DatagramPacket dgRequest = new DatagramPacket(bytes, bytes.length,
          serverHost, port);
      dgSocket.send(dgRequest);

      byte[] byteBuffer = new byte[1000];
      DatagramPacket dgResponse = new DatagramPacket(byteBuffer,
          byteBuffer.length);
      dgSocket.receive(dgResponse);
      System.out.println("Datagram Response: " + new String(dgResponse.getData()));

    } catch (SocketException e) {
      System.out.println("Socket exception: " + e.getMessage());
    } catch (UnknownHostException e) {
      System.out.println("Unknown host exception: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO exception: " + e.getMessage());
    } finally {
      if (dgSocket != null) {
        dgSocket.close();
      }
    }
  }
}
