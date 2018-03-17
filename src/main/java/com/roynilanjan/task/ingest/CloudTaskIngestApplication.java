package com.roynilanjan.task.ingest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.roynilanjan.task.ingest","org.springframework.cloud.stream.messaging"})
public class CloudTaskIngestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskIngestApplication.class, args);
	}
}
