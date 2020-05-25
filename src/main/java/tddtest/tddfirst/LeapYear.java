package tddtest.tddfirst;

public class LeapYear {
	
	public boolean isLeapYear(int year)
	{
		boolean b=false;
		if(year<1582)
		{
			b=isLeapYearJulianCalander(year);
		}
		else
		{
			if(year%400==0)
				b=true;
			else if(year%4==0 && (year%100)!=0)
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
	
	

}
