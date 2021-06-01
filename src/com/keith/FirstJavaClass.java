package com.keith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;


public class FirstJavaClass {
	private static BigDecimal bigDecimal;
	public static ACMEBicycle bike = new ACMEBicycle();
	

	public static void main(String[] args) {
		bigDecimal = new BigDecimal(0);
		System.out.println("Hi There World!"+bigDecimal);

		int sum = 0;
		int[] numbers = {1,2,3,4,5};
		for (int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
		
		RideBike();
		System.out.println("Final Bike Speed after RideBike = "+bike.speed);
	
	}


	public static void RideBike() {
		bike.changeGear(2);
		bike.changeCadence(5);
		bike.printStates();
		
		bike.speedUp(3);		
		bike.printStates();
		
		bike.applyBrakes(2);
		bike.printStates();
		
		System.out.println(bike.honkHorn());	
		System.out.println("Final Bike Speed = "+bike.speed);
		
	}
	@Test
	public void myBikeTestMethod() {
		RideBike();
		System.out.println("Test bike speed = "+bike.speed);
		assertEquals(1, bike.speed);
	}

}
