package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Odometer;

/**
 * This class will test the incrementDigit method in the Odometer class
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
public class OdometerWhenIncrementDigit {

	/**
	 * Test to be sure IncrementDigit advances the 10ths place on a
	 * new Odometer (000.0) by 5 turns showing 000.5
	 *
	 */
	@Test
	public void test10sPlaceIncrementBy5ShouldHave0005() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.5", value);
	}
	
	/**
	 * Test to be sure incrementDigit by zero does not move the dial.
	 * This test uses the 100s place on a
	 * new Odometer (000.0) by 0 turns showing 000.0
	 *
	 */
	@Test
	public void test100sPlaceIncrementBy0ShouldHave0000() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(0, 0);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.0", value);
	}
	
	/**
	 * Test to be sure IncrementDigit advances the 100s place on a
	 * Odometer initialized at 999.9) advancing the by 5 turns showing 999.4
	 *
	 */
	@Test
	public void testInitial9999Increment10thsPlaceBy5ShouldHave0004() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.incrementDigit(3, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 999.4", value);
	}
	
	/**
	 * Test to be sure IncrementDigit advances the 10ths place on a
	 * new Odometer (000.0) by 12 turns showing 000.2
	 *
	 */
	@Test
	public void test10sPlaceIncrementBy12ShouldHave0002() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 12);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.2", value);
	}

}
