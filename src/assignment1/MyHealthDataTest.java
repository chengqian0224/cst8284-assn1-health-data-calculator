/* 
 * File name: MyHealthDataTest.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 1
 * Date: October 15, 2024
 * Professor: Gustavo Adami
 * Purpose: This file contains the driver class for the Electronic Health Records (EHR) System.
 */

package assignment1;

// Import Scanner to prompt user for input
import java.util.Scanner;

// Import LocalDate to get current year
import java.time.LocalDate;

/** 
 * MyHealthDataTest is the driver class of for the Electronic Health Records (EHR) System, also known 
 * as Assignment 1. It tests the MyHealthData class by prompting the user to input of the patient's information
 * displaying the calculated health metrics.
 * @author Cheng Qian
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthData
 * @see MyHealthDataBase
 */
public class MyHealthDataTest {

	/**
     * The entry point of the program to collect user input and display health metrics.
     * @param args Command-line arguments.
     */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt for input of the patient’s data
		System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Enter weight (in pounds): ");
        double weight = input.nextDouble();

        System.out.print("Enter birth year: ");
        int birthYear = input.nextInt();

        // Get current year from LocalDate
        int currentYear = LocalDate.now().getYear();
        
        // Instantiate an object of the class MyHealthData for the patient
        MyHealthData patient = new MyHealthData(firstName, lastName, gender, height, weight, birthYear, currentYear);
        
        // Display the patient's health data
        patient.displayMyHealthData();
        
        input.close();

	}

}
