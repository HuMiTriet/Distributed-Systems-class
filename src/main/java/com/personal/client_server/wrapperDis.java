package com.personal.client_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class wrapperDis extends PushbackInputStream {
  wrapperDis(InputStream in) {
    super(in);
  }

  @Override
  public int available() throws IOException {
    int b = super.read();
    super.unread(b);
    return super.available();
  }
}
