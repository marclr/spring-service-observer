package com.github.marclr.springserviceobserver.sensor;

import com.github.marclr.springserviceobserver.screen.Screen;
import org.springframework.stereotype.Service;

/**
 * Created by Marc on 16/10/2017.
 */
@Service
public class SensorProcess {
  private SensorService sensorService;

  public SensorProcess(SensorService sensorService) {
    this.sensorService = sensorService;
  }

  public void temperature(String id) {
    Screen screen = new Screen("screen 1");
    long temp = sensorService.getTemperature();
    Sensor sensor = new Sensor(id, temp);
    sensor.attach(screen);
    sensor.process();
  }
}
