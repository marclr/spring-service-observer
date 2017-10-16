package com.github.marclr.springserviceobserver.screen;

import com.github.marclr.springserviceobserver.sensor.Observable;

/**
 * Created by Marc on 16/10/2017.
 */
public abstract class Observer {
  protected String id;

  public abstract void update(String message);
  public abstract void update(Observable o);

  public abstract String getId();
  public abstract void setId(String id);
}
