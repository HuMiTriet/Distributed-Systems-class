package com.personal.threads;

public class Counting extends Thread {
  private int threadNumber = 0;

  public Counting(int threadNumber) {
    this.threadNumber = threadNumber;
  }

  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println("Thread " + threadNumber + ": " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Thread 1: Done");
  }
}
