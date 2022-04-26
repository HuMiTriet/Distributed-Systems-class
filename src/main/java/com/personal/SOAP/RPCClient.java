package com.personal.SOAP;

import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

public class RPCClient {
  public static void main(String[] args) throws Exception {
    URL url = new URL("http://localhost:8080/SOAP/RPCServer?wsdl");

    // 1st argument service URI, refer to wsdl document above
    // 2nd argument is service name, refer to wsdl document above
    QName qname = new QName("http://SOAP.personal.com/", "RPCServerImplService");
    Service service = Service.create(url, qname);
    RPCServer server = service.getPort(RPCServer.class);
    System.out.println(server.getRPCServerName("Triet Huynh RPC SOAP server"));
  }
}
