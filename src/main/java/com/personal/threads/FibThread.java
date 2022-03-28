package com.personal.threads;

public class FibThread extends Thread {
  private int n;
  public int result;

  public FibThread(int n) {
    this.n = n;
  }

  @Override
  public void run() {
    if (n < 2)
      result = 1;
    else {
      FibThread fibDrecementOne = new FibThread(n - 1);
      FibThread fibDecrementTwo = new FibThread(n - 2);

      fibDrecementOne.start();
      fibDecrementTwo.start();

      try {
        fibDrecementOne.join();
        fibDecrementTwo.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      result = fibDrecementOne.result + fibDecrementTwo.result;
    }

  }
}
