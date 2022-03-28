package com.personal.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUDP {
  // public static void execute(String[] args) {
  public static void main(String[] args) {

    DatagramSocket dgSocket = null;

    try {
      int socketNumber = 17;
      dgSocket = new DatagramSocket(socketNumber);
      byte[] byteBuffer = new byte[1000];

      while (true) {
        // get request from client
        DatagramPacket dgRequest = new DatagramPacket(byteBuffer,
            byteBuffer.length);
        dgSocket.receive(dgRequest);

        String receivedMsg = new String(dgRequest.getData());

        receivedMsg.toUpperCase();

        byte[] responseBytes = receivedMsg.getBytes();

        // do something to the client request

        DatagramPacket dgRespone = new DatagramPacket(responseBytes,
            responseBytes.length, dgRequest.getAddress(), dgRequest.getPort());
        dgSocket.send(dgRespone);
      }

    } catch (SocketException e) {
      System.out.println("Socket exception: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO exception: " + e.getMessage());
    } finally {
      if (dgSocket != null) {
        dgSocket.close();
      }
    }

  }
}
