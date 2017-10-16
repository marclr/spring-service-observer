package com.github.marclr.springserviceobserver.screen;

import com.github.marclr.springserviceobserver.sensor.Observable;

/**
 * Created by Marc on 16/10/2017.
 */
public class Screen extends Observer {

  public Screen(String id) {
    this.id = id;
  }

  @Override
  public void update(String message) {
    System.out.println("UPDATE SCREEN SENSOR: " + message);
  }

  @Override
  public void update(Observable o) {
    System.out.println("UPDATE SCREEN SENSOR: " + o.getId());
  }

  @Override
  public String getId() {
    return id;
  }


  @Override
  public void setId(String id) {
    this.id = id;
  }
}
