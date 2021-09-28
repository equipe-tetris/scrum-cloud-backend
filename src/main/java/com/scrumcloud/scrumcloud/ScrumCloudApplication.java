package com.scrumcloud.scrumcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
public class ScrumCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScrumCloudApplication.class, args);
	}

}
