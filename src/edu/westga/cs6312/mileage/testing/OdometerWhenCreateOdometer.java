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
	 * correctly create an odometer showing 000.0
	 */
	@Test
	public void test0ParameterConstructorShoulHaveMileage0000() {
		Odometer theOdometer = new Odometer();
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.0", value);
	}

}
