package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Odometer;

/**
 * This class will serve to test the Odometer class when a new object is created
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
public class OdometerWhenCreateOdometer {

	/**
	 * Test to be sure that the Odometer's 0-parameter constructor will
	 * correctly create an Odometer showing 000.0
	 */
	@Test
	public void test0ParameterConstructorShoulHaveMileage0000() {
		Odometer theOdometer = new Odometer();
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.0", value);
	}
	
	/**
	 * Test to be sure that the Odometer's 4 paramet constructor will
	 * correctly create an Odometer showing 489.3 when given the 4, 8, 9, 3 
	 * as parameters
	 */
	@Test
	public void test4ParameterConstructorShouldHaveMileage4893() {
		Odometer theOdometer = new Odometer(4, 8, 9, 3);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 489.3", value);
	}
	
	/**
	 * Test to be sure that the Odometer's 4 paramet constructor will
	 * correctly create an Odometer showing 489.3 when given the 4, 8, 9, 3 
	 * as parameters
	 */
	@Test
	public void test4ParameterConstructorMinimumShouldHaveMileage0000() {
		Odometer theOdometer = new Odometer(0, 0, 0, 0);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.0", value);
	}
	
	/**
	 * Test to be sure that the Odometer's 4 paramet constructor will
	 * correctly create an Odometer showing 489.3 when given the 4, 8, 9, 3 
	 * as parameters
	 */
	@Test
	public void test4ParameterConstructorMaximumShouldHaveMileage9999() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 999.9", value);
	}
}
