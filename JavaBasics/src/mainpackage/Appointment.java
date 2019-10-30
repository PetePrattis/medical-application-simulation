package mainpackage;

public class Appointment extends Doctor  {
	
	private int day;
	private int month;
	private int year;
	
	//Set DATE
	public void setDay(int day1)
	{
		this.day = day1;
	}
		
	public void setMonth(int month)
	{
		this.month = month;
	}
		
	public void setYear(int year)
	{
		this.year = year;
	}
		
	//get date
	public String date()
	{
		String date = Integer.toString(day) + "."+Integer.toString(month) + "."+Integer.toString(year);
		return date;
	}
	
}
