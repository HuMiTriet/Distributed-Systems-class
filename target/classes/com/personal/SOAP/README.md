# Huynh Minh Triet - 17447

## In this folder you will find the code file for implementing SOAP using RPC 

In the file RPCServer there are three methods:
  - String getRPCServerName(String name);
  - int doubleEnterNumber(int number);
  - int sumOfTwoNumber(int number1, int number2);

The method getRPCServerName is the example given in the original slide shown in
class.

The next two method are additional implementation by me. 
- The method doubleEnterNumber simply takes in an int number and output its 
result times two

- The method sumOfTwoNumber takes in two number and return the sum

The RPCPublisher class publish the RPCServer interface on the localhost via 
port 8080.

The RPCClient will assign a unique Qname to the RPCServerImpl class to avoid 
name conflicts that other class may have.
