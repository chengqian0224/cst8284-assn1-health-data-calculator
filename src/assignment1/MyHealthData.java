/* 
 * File name: MyHealthData.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 1
 * Date: October 15, 2024
 * Professor: Gustavo Adami
 * Purpose: This file contains the class that maintains the patient's health information.
 */

package assignment1;

/** 
 * MyHealthData is the class used for maintain the patient's health information 
 * for the Electronic Health Records (EHR) System, also known as Assignment 1. 
 * It inherits from the class MyHealthDataBase.
 * @author Cheng Qian
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthDataBase
 * @see MyHealthDataTest
 */
public class MyHealthData extends MyHealthDataBase
{
	/**
	 * The patient's first name.
	 */
	private String firstName;
	
	/**
	 * The patient's last name.
	 */
	private String lastName;
	
	/**
	 * The patient's gender.
	 */
	private String gender;
	
	/**
	 * The patient's year of birth.
	 */
	private int birthYear;
	
	/**
	 * The current year, used for calculating the patient's age.
	 */
	private int currentYear;
	
	/**
	 * The patient's height in inches.
	 */
	private double height;
	
	/**
	 * The patient's weight in pounds.
	 */
	private double weight;

	/**
	 * This constructor constructs a new MyHealthData object with the provided patient data.
	 * It accepts the patient's personal and health information including the patient's first name, last name, 
	 * gender, height, weight, birth year, and current year.
	 * @param firstName First name of the patient.
	 * @param lastName Last name of the patient.
	 * @param gender Gender of the patient.
	 * @param height Height of the patient in inches.
	 * @param weight Weight of the patient in pounds.
	 * @param birthYear Birth year of the patient.
	 * @param currentYear Current year.
	 */
	public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height; // in inches
		this.weight = weight; // in pounds
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}

	/** 
    * This method returns the first name of the patient.
    * @return First name of the patient
    */
	public String getFirstName() {
		return firstName;
	}
	
	/** 
    * This method sets the first name of the patient.
    * @param firstName First name of the patient.
    */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** 
    * This method returns the last name of the patient.
    * @return Last name of the patient
    */
	public String getLastName() {
		return lastName;
	}

	/** 
    * This method sets the last name of the patient.
    * @param lastName Last name of the patient.
    */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** 
    * This method returns the gender of the patient.
    * @return Gender of the patient.
    */
	public String getGender() {
		return gender;
	}
	
	/** 
    * This method sets the gender of the patient.
    * @param gender Gender of the patient.
    */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/** 
    * This method returns the birth year of the patient.
    * @return Birth year of the patient.
    */
	public int getBirthYear() {
		return birthYear;
	}

	/** 
    * This method sets the birth year of the patient.
    * @param birthYear Birth year of the patient.
    */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/** 
    * This method returns the current year.
    * @return Current year.
    */
	public int getCurrentYear() {
		return currentYear;
	}

	/** 
    * This method returns the height of the patient in inches.
    * @return Height of the patient in inches.
    */
	public double getHeight() {
		return height;
	}

	/** 
    * This method sets the height of the patient in inches.
    * @param height Height of the patient in inches.
    */
	public void setHeight(double height) {
		this.height = height;
	}

	/** 
    * This method returns the weight of the patient in pounds.
    * @return Weight of the patient in pounds.
    */
	public double getWeight() {
		return weight;
	}

	/** 
    * This method sets the weight of the patient in pounds.
    * @param weight Weight of the patient in pounds.
    */
	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
	/** 
    * This method returns the age of the patient, by calculating from currentYear and birthYear.
    * @return Age of the patient in years.
    */
	public int getAge() {
		return currentYear - birthYear;
	}
	
	/** 
    * This method returns the maximum heart rate of the patient, calculated as 220 - Age in years.
    * @return Maximum heart rate of the patient.
    */
	public int getMaximumHeartRate() {
		return 220 - getAge();
	}
	
	/** 
    * This method returns the minimum target heart rate of the patient, calculated as 50% of MaximumHeartRate.
    * @return Minimum target heart rate of the patient.
    */
	public double getMinimumTargetHeartRate() {
		return 0.5 * getMaximumHeartRate();
	}
	
	/** 
    * This method returns the maximum target heart rate of the patient, calculated as 85% of MaximumHeartRate.
    * @return Maximum target heart rate of the patient.
    */
	public double getMaximumTargetHeartRate() {
		return 0.85 * getMaximumHeartRate();
	}


	/** 
    * This method displays the patient's health data.
    */
    public void displayMyHealthData() 
    {
		System.out.printf("Patient's Information:%n");
		System.out.printf("First Name: %s%n", firstName);
		System.out.printf("Last Name: %s%n", lastName);
		System.out.printf("Gender: %s%n", gender);
		System.out.printf("Year of birth: %d%n", birthYear);
		System.out.printf("Height: %.2f inches%n", height);
		System.out.printf("Weight: %.2f pounds%n", weight);
		System.out.printf("Age: %d years%n", getAge());
		System.out.printf("BMI: %.2f%n", calculateBMI(weight, height));
		System.out.printf("Maximum heart rate: %d BPM%n", getMaximumHeartRate());
		System.out.printf("Target heart rate range: %.2f - %.2f BPM%n", getMinimumTargetHeartRate(), getMaximumTargetHeartRate());
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
    }
}