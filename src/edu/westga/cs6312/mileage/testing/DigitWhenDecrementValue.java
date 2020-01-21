package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Digit;

/**
 * This class will test the decrement method in the Digit class
 * 
 * @author J. Allen Burton
 * @version Jan 18, 2020
 *
 */
class DigitWhenDecrementValue {

	/**
	 * This method will confirm that decrement Digit from 5 will produce a current
	 * value of 4
	 */
	@Test
	void testDecrementDigit5ShouldGiveValue4() {
		Digit theDigit = new Digit();
		for (int count = 0; count < 5; count++) {
			theDigit.increment();
		}

		theDigit.decrement();
		int value = theDigit.getValue();
		assertEquals(4, value);
	}

	/**
	 * This method will confirm that when decrement is performed on a new Digit
	 * (initial value 0) will produce a current value of 9
	 */
	@Test
	void testDecrementDigit0ShouldGiveValue9() {
		Digit theDigit = new Digit();
		theDigit.decrement();

		int value = theDigit.getValue();
		assertEquals(9, value);
	}

	/**
	 * This method will confirm that decrement Digit from 9 will produce a current
	 * value of 8
	 */
	@Test
	void testDecrementDigit9ShouldGiveValue8() {
		Digit theDigit = new Digit();
		for (int count = 0; count < 9; count++) {
			theDigit.increment();
		}

		theDigit.decrement();
		int value = theDigit.getValue();
		assertEquals(8, value);
	}

	/**
	 * This method will confirm that decrementing Digit 14 times will produce a
	 * current value of 6
	 */
	@Test
	public void testDecrement14TimesShouldGiveValue6() {
		Digit theDigit = new Digit();
		for (int count = 0; count < 14; count++) {
			theDigit.decrement();
		}

		int value = theDigit.getValue();
		assertEquals(6, value);
	}

}
