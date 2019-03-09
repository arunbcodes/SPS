package com.strategy.picker.stock.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.strategy.picker.stock")
@EnableScheduling
@Slf4j
public class StockPickerStrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPickerStrategyApplication.class, args);
	}

}
