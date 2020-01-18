package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Digit;

public class DigitWhenCreateDigit {

	@Test
	public void test() {
		Digit theDigit = new Digit();
		int value = theDigit.getValue();
		assertEquals(0, value);
	}

}
