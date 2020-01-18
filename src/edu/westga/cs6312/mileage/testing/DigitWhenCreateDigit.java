package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Digit;

/**
 * This class will test the value stored in a newly created Digit object
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
public class DigitWhenCreateDigit {

	/**
	 * Test to verify that getValue returns correct value of Digit
	 * When object is created the value should be zero so that
	 * should be the return value when called here.
	 */
	@Test
	public void test() {
		Digit theDigit = new Digit();
		int value = theDigit.getValue();
		assertEquals(0, value);
	}

}
