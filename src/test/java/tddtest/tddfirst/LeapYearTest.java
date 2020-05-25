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

	

}
