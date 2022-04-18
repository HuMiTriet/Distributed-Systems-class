package com.personal.SOAP;

import javax.jws.WebService;

@WebService(endpointInterface = "com.personal.SOAP.RPCServer")
public class RPCServerImpl implements RPCServer {
  @Override
  public String getRPCServerName(String name) {
    return "RPCServerImpl: " + name;
  }
}
