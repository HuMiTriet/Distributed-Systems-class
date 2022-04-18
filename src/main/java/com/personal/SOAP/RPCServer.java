package com.personal.SOAP;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
interface RPCServer {
  @WebMethod
  String getRPCServerName(String name);
}
