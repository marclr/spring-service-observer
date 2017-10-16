package com.github.marclr.springserviceobserver.sensor;

import org.springframework.stereotype.Service;

/**
 * Created by Marc on 16/10/2017.
 */
@Service
class SensorService {
  private static final int MAX = 100;

  int getTemperature() {
    return (int) (Math.random()*MAX);
  }
}
