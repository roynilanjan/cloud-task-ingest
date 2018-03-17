package com.roynilanjan.task.ingest.config;

import com.roynilanjan.task.ingest.TaskProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

	@Bean
	public TaskProcessor taskProcessor() {
		return new TaskProcessor();
	}
}
