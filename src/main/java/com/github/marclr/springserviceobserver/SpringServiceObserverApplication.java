package com.github.marclr.springserviceobserver;

import com.github.marclr.springserviceobserver.sensor.SensorProcess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringServiceObserverApplication {


	private SensorProcess sensorProcess;

	public SpringServiceObserverApplication(
			SensorProcess sensorProcess) {
		this.sensorProcess = sensorProcess;
	}

	@Scheduled(fixedDelay=1000)
	public void scheduler() {
		sensorProcess.temperature("1");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceObserverApplication.class, args);
	}
}
