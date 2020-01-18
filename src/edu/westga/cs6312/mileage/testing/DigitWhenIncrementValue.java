package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Digit;

class DigitWhenIncrementValue {

	/**
	 * This method will confirm that incrementing a new Digit will
	 * produce a current value of 1
	 */
	@Test
	void testIncrementNewDigitShouldGiveValue1() {
		Digit theDigit = new Digit();
		theDigit.increment();
		int value = theDigit.getValue();
		assertEquals(1, value);
	}

}
