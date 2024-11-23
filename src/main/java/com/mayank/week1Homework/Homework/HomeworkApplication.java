package com.mayank.week1Homework.Homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
		Frosting frosting = new ChocolateFrosting(); // You can switch to StrawberryFrosting
        Syrup syrup = new StrawberrySyrup(); // You can switch to ChocolateSyrup

        // Create CakeBaker with dependencies
        CakeBaker cakeBaker = new CakeBaker(frosting, syrup);

        // Call bakeCake method
        cakeBaker.bakeCake();
	}

}
