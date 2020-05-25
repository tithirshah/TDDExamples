package tddtest.tddfirst;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {
	
	LeapYear lp=new LeapYear();
	
	@Test
	public void isYearDivisiblebyFour()
	{
		assertTrue(lp.isLeapYear(2012));
		assertFalse(lp.isLeapYear(1999));
	}


	@Test
	public void isYearDivisibleby4andNotby100()
	{
		assertFalse(lp.isLeapYear(2200));
		assertTrue(lp.isLeapYear(2000));
	}
	
	@Test
	public void isYearDivisibleby400()
	{
		assertTrue(lp.isLeapYear(4000));
		assertTrue(lp.isLeapYear(2400));
	}
	
	@Test
	public void isYearDivisibleby100and400()
	{
		assertFalse(lp.isLeapYear(1700));
		assertFalse(lp.isLeapYear(1800));
		assertFalse(lp.isLeapYear(1900));
		assertFalse(lp.isLeapYear(2100));
		
	}
	
	@Test
	public void isLeapYearasPerJulianCalander()
	{
		assertTrue(lp.isLeapYear(1444));
		assertTrue(lp.isLeapYear(1200));
		assertTrue(lp.isLeapYear(1000));
		assertFalse(lp.isLeapYear(1551));
		assertFalse(lp.isLeapYear(1433));
		
	}
	
	
	
	

}
