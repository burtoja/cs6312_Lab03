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
	
	/**
	 * This method will confirm that incrementing Digit from 5
	 * will produce a current value of 6 
	 */
	@Test
	public void testIncrementDigit5ShouldGiveValue6() {
		Digit theDigit = new Digit();
		for (int count = 0; count < 5; count++) {
			theDigit.increment();
		}
		
		theDigit.increment();
		int value = theDigit.getValue();
		assertEquals(6, value);
	}
	
	/**
	 * This method will confirm that incrementing Digit from 9
	 * will produce a current value of 0
	 */
	@Test
	public void testIncrementDigit9ShouldGiveValue0() {
		Digit theDigit = new Digit();
		for (int count = 0; count < 9; count++) {
			theDigit.increment();
		}
		
		theDigit.increment();
		int value = theDigit.getValue();
		assertEquals(0, value);
	}

}
