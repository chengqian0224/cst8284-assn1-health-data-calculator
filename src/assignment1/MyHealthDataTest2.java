/* 
 * File name: MyHealthDataTest2.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 1
 * Date: October 15, 2024
 * Professor: Gustavo Adami
 * Purpose: This file contains the JUnit Test class for the Electronic Health Records (EHR) System.
 * Explanation: The math error in the testIncorrectBMI Test was multiplying heightParam by weightParam 
 * in the formula instead of using the square of heightParam.
 */

package assignment1;

import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-12;

	@Test
	public void testCalculateBMI() {
		
		// Instantiate an object of MyHealthData with height of 66.93 inches and weight of 142 pounds.
		MyHealthData testPatient = new MyHealthData("Cheng", "Qian", "Female", 66.93, 142, 1996, 2024); 
		
		// Use calculateBMI() method to get the calculated BMI with the object's metrics.
		double actualBMI = testPatient.calculateBMI(testPatient.getWeight(), testPatient.getHeight());
		
		// Calculate expectedBMI manually with weight of 142 pounds and height of 66.93 inches.
		double expectedBMI = 142 * 703 / (66.93 * 66.93);
		
		// Compare the values of actuaBMI and expectedBMI.
		Assert.assertEquals("calculateBMI() return value does not match expectations", expectedBMI, actualBMI, EPSILON);
	}
	
	@Test
	public void testIncorrectBMI() {
		// Instantiate an object of MyHealthData with height of 66.93 inches and weight of 142 pounds.
		MyHealthData testPatient = new MyHealthData("Cheng", "Qian", "Female", 66.93, 142, 1996, 2024); 
		
		// Use incorrectBMI() method to get the calculated BMI with the object's metrics.
		double actualBMI = testPatient.incorrectBMI(testPatient.getWeight(), testPatient.getHeight());
		
		// Calculate expectedBMI manually with weight of 142 pounds and height of 66.93 inches.
		double expectedBMI = 142 * 703 / (66.93 * 66.93);
		
		// Compare the values of actuaBMI and expectedBMI.
		Assert.assertNotEquals("incorrectBMI() return value does not match expectations", expectedBMI, actualBMI, EPSILON);
		
	}

}
