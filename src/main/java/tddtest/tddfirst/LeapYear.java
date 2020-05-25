package tddtest.tddfirst;

public class LeapYear {
	
	private int year;
	
	public boolean isLeapYear(int year)
	{
		this.year=year;
		boolean b=false;
		if(year<1582)
		{
			b=isLeapYearJulianCalander(year);
		}
		else
		{
			if(isDivisible(400) || isDivisible(4) && !isDivisible(100)) 
				b=true;
			else
				b=false;
		}
		return b;
		
	}

	private boolean isLeapYearJulianCalander(int year) {
		if(year%4==0)
			return true;
		else
			return false;
	}
	
	private boolean isDivisible(int d)
	{
		if(year%d==0)
			return true;
		else
			return false;
	}
	
	

}
