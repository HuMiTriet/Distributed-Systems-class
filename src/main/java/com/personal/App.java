package com.personal;

import com.personal.threads.FibThread;

public class App {
  public static void main(String[] args) {
    FibThread fibThread = new FibThread(10);
    fibThread.start();
    try {
      fibThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(fibThread.result);
  }
}
