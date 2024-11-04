package com.eventsourcing.eventsourcing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventsourcingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventsourcingApplication.class, args);
	}

}
