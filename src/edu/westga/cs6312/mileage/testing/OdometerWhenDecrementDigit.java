package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.mileage.model.Odometer;

/**
 * This JUnit test class will test the decrementDigit method in the Odometer class
 * 
 * @author J. Allen Burton
 * @version Jan 20, 2020
 *
 */
public class OdometerWhenDecrementDigit {

	/**
	 * Test to be sure decrementDigit rolls back the 10s place on a
	 * Odometer set to 555.5 by 4 turns showing 515.5
	 *
	 */
	@Test
	public void test10sPlaceStartAt5555DecrementBy4ShouldHave5155() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(1, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 515.5", value);
	}
	
	/**
	 * Test to be sure decrementDigit rolls back the 100s place on a
	 * Odometer set to 000.0 by 4 turns showing 600.0
	 *
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy4ShouldHave6000() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(0, 4);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 600.0", value);
	}
	
	/**
	 * Test to be sure decrementDigit rolls back the 100s place on a
	 * Odometer set to 000.0 by 18 turns showing 200.0
	 *
	 */
	@Test
	public void test100sPlaceStartAt0000DecrementBy18ShouldHave2000() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(0, 18);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 200.0", value);
	}
	
	/**
	 * Test to be sure decrementDigit by zero does not move the dial.  
	 * This test uses the 100s place on a Odometer set to 555.5 by 0 turns showing 555.5
	 *
	 */
	@Test
	public void test100sPlaceStartAt5555DecrementBy0ShouldHave5555() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(0, 0);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 555.5", value);
	}
	
	/**
	 * Test to be sure decrementDigit rolls back the ones place on a
	 * Odometer set to 000.0 by 5 turns showing 995.0
	 *
	 */
	@Test
	public void test1sPlaceStartAt0000DecrementBy5ShouldHave9950() {
		Odometer theOdometer = new Odometer();
		theOdometer.decrementDigit(2, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 995.0", value);
	}
	
	/**
	 * Test of precondition.  Odometer set at 555.5. Given dial -1.  
	 * Odometer should stay at 555.5.
	 *
	 */
	@Test
	public void testPreconditionOdometerSetAt5555ChooseDialNeg1ShouldHave5555() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.decrementDigit(-1, 8);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 555.5", value);
	}

}
