package com.github.marclr.springserviceobserver.sensor;

import com.github.marclr.springserviceobserver.screen.Observer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by Marc on 16/10/2017.
 */
public abstract class Observable {
  protected String id;
  protected long temperature;

  private Map<String, Observer> observers;

  public Observable() {
    observers = new HashMap<>();
  }

  public void attach(Observer o) {
    observers.put(o.getId(), o);
  }

  public void detach(Observer o) {
    observers.remove(o.getId());
  }

  public void notifyObserver() {
    for(Entry<String, Observer> entry : observers.entrySet()) {
      Observer o = entry.getValue();
      o.update(this);
    }
  }

  public void notifyObserver(String message) {
    for(Entry<String, Observer> entry : observers.entrySet()) {
      Observer o = entry.getValue();
      o.update(message);
    }
  }

  public abstract String getId();
  public abstract void setId(String id);

  public abstract void process();
}
