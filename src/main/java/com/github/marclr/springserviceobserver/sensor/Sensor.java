package com.github.marclr.springserviceobserver.sensor;

/**
 * Created by Marc on 16/10/2017.
 */
public class Sensor extends Observable implements Runnable {

  public Sensor(String id, long temperature) {
    this.id = id;
    this.temperature = temperature;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public void process() {
    double random = Math.random();
    if(random > 0.5) {
      methodException(random);
    } else {
    }
  }

  private void methodException(double random) {
    try {
      throw new Exception("Exception 1, value: " + random);
    } catch (Exception e) {
      notifyObserver(e.getMessage());
    }
  }



  @Override
  public void run() {
    System.out.println("Arrenca el thread " + id);
    while(true) {
      try {
        Thread.sleep(temperature);
        notifyObserver();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
