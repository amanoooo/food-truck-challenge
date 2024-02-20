package com.amano.foodtruckchallenge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.amano.foodtruckchallenge.mapper")
public class FoodTruckChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckChallengeApplication.class, args);
	}

}
