/* 
 * File name: MyHealthData.java
 * Author: Cheng Qian, 041167176
 * Course: CST8284 - Object Oriented Programming (Java)
 * Assignment: Assignment 1
 * Date: October 15, 2024
 * Professor: Gustavo Adami
 * Purpose: This file contains the base class be extended for the Electronic Health Records (EHR) System, which builds the method to calculate BMI.
 */

package assignment1;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Cheng Qian
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
* @see MyHealthDataTest
*/
public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return BMI calculated from Weight and Height of the patient
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    public double incorrectBMI(double weightParam, double heightParam) {
    	return weightParam * 703 / (heightParam * weightParam);
    }
}