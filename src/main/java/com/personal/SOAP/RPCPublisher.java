package com.personal.SOAP;

import javax.xml.ws.Endpoint;

public class RPCPublisher {
  public static void main(String[] args) {
    Endpoint.publish("http://localhost:8080/ws/RPCServer", new RPCServerImpl());
  }
}
