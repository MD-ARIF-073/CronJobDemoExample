package com.example.cronJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableScheduling
public class CronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronJobApplication.class, args);
	}

	//@Scheduled(cron = "*/10 * * * * ?", zone = "Asia/Riyadh")  // run every 10 seconds
	@Scheduled(cron = "* 34 19 * * ?", zone = "Asia/Dhaka")  // executed at 19:34 every day
	public void function(){
		System.out.println("current time: "+ LocalDateTime.now());
	}

}
