package edu.westga.cs6312.mileage.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	 * Test to be sure incrementDigit advances the 10ths place (decimal) on a new
	 * Odometer (000.0) by 5 turns showing 000.5
	 */
	@Test
	public void test10thsPlaceIncrementBy5ShouldHave0005() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.5", value);
	}

	/**
	 * Test to be sure incrementDigit advances the ones place on a new Odometer
	 * (000.0) by 5 turns showing 005.0
	 */
	@Test
	public void test1sPlaceIncrementBy5ShouldHave0050() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(2, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 005.0", value);
	}

	/**
	 * Test to be sure incrementDigit advances the 100s place on a new Odometer
	 * (000.0) by 5 turns showing 500.0
	 */
	@Test
	public void test100sPlaceIncrementBy5ShouldHave5000() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(0, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 500.0", value);
	}

	/**
	 * Test to be sure incrementDigit by zero does not move the dial. This test uses
	 * the 100s place on a new Odometer (000.0) by 0 turns showing 000.0
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
	 * Test to be sure incrementDigit advances the 100s place on a new Odometer
	 * (000.0) by 12 turns showing 200.0
	 */
	@Test
	public void test100sPlaceIncrementBy12ShouldHave2000() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(0, 12);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 200.0", value);
	}

	/**
	 * Test to be sure incrementDigit advances the 10ths (decimal) place on a new
	 * Odometer (000.0) by 12 turns showing 200.0
	 */
	@Test
	public void test10thsPlaceIncrementBy12ShouldHave0012() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 12);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 001.2", value);
	}

	/**
	 * Test to be sure that when IncrementDigit advances the 10ths (decimal) place
	 * on a Odometer initialized at 999.9 by 5 turns it will roll over and show
	 * 000.4
	 */
	@Test
	public void testInitial9999Increment10thsPlaceBy5ShouldHave0004() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.incrementDigit(3, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 000.4", value);
	}

	/**
	 * Test to be sure that when IncrementDigit advances the ones place on a
	 * Odometer initialized at 999.9 by 5 turns it will rollover the dials to the
	 * left and show 004.9
	 */
	@Test
	public void testInitial9999Increment1sPlaceBy5ShouldHave0049() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.incrementDigit(2, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 004.9", value);
	}

	/**
	 * Test to be sure that when IncrementDigit advances the 100s place on a
	 * Odometer initialized at 999.9 by 5 turns it will rollover only that dial to
	 * the left and show 499.9
	 */
	@Test
	public void testInitial9999Increment100sPlaceBy5ShouldHave4999() {
		Odometer theOdometer = new Odometer(9, 9, 9, 9);
		theOdometer.incrementDigit(0, 5);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 499.9", value);
	}

	/**
	 * Test to be sure that when IncrementDigit advances properly for a large number
	 * of turns affecting all dials. Odometer initialized at 000.0 incremented by
	 * 5678 turns will show 499.9
	 */
	@Test
	public void testInitial0000Increment10thsPlaceBy5678ShouldHave5678() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 5678);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 567.8", value);
	}

	/**
	 * Test to be sure that when IncrementDigit advances properly for a large number
	 * of turns affecting all dials with roll over. Odometer initialized at 000.0
	 * incremented by 25678 turns will show 499.9
	 */
	@Test
	public void testInitial0000Increment10thsPlaceBy25678ShouldHave5678() {
		Odometer theOdometer = new Odometer();
		theOdometer.incrementDigit(3, 25678);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 567.8", value);
	}

	/**
	 * Test of precondition. Odometer set at 555.5. Given dial -1. Odometer should
	 * stay at 555.5.
	 */
	@Test
	public void testPreconditionOdometerSetAt5555ChooseDialNeg1ShouldHave5555() {
		Odometer theOdometer = new Odometer(5, 5, 5, 5);
		theOdometer.incrementDigit(-1, 8);
		String value = theOdometer.toString();
		assertEquals("Odometer with mileage 555.5", value);
	}

}
