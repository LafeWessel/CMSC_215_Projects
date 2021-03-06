package Project_01;

public class CalendarDate {
	private static enum Months{
		January,February,March,April,May,June,July,August,September,October,November,December
	}
	private static enum Days{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}
	protected int day;
	protected int year;
	protected int m;
	protected Months month;
	
	public static final Days JAN12012 = Days.Sunday;
	
	protected static final Months[] thirtyDays = {Months.April,Months.June,Months.September,Months.November};
	protected static final Months[] thirtyOneDays = {Months.January,Months.March,Months.May,Months.July,Months.August,Months.October,Months.December};
	
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return m;
	}
	
	
	/*
	 * Note: 
	 * I do NOT account for leap years, so some calculations will be off due to such inaccuracy
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	public CalendarDate() {
		day = 1;
		month = setMonth(1);
		year = 2012;
		m = 1;
	}
	
	public CalendarDate(int d, int m, int y) {
		
		if(d > getDaysInMonth(m) || d < 1 || m > 12 || m < 1 || y < 0) {
			throw new IllegalDateException("Invalid Date!");
		}
		day = d;
		month = setMonth(m);
		this.m = m;
		year = y;
	}
	
	//returns string format of whatever the next day is
	public String nextDay() {
		//increment day
		int d = day + 1;
		Months m = month;
		int mon = this.m;
		int y = year;
		
		//Check for February
		if (d > 28 && m.equals(Months.February)) {
			d = 1;
			m = Months.March;
			mon++;
		}
		//Check for 30 days
		else if (d > 30 && monthFoundInArray(m,thirtyDays)) {
			d = 1;
			m = setMonth(++mon);
		}
		//Check for 31 days
		else if (d > 31 && monthFoundInArray(m,thirtyOneDays)) {
			d = 1;
			if(m.equals(Months.December)) {
				mon = 1;
				m = setMonth(mon);
				y++;
			}
			else {
				m = setMonth(++mon);
			}
			
		}
		return m.toString() + " " + d + ", " + y;
	}
	
	//returns string format of whatever previous day was
	public String previousDay() {
		
		int d = day;
		Months m = month;
		int mon = this.m;
		int y = year;
		
		//decrement day
		if(d > 1) {
			d--;
		}else {
			//if rolling back from january
			if(mon == 1) {
				mon = 12;
				m = setMonth(mon);
				d = 31;
				y--;
			}
			else {
				//determining last day of previous month
				m = setMonth(--mon);
				if(m.equals(Months.February)) {
					d = 28;
				} else if(monthFoundInArray(m,thirtyDays)){
					d = 30;
				} else {
					d = 31;
				}
			}
		}
		
		return m.toString() + " " + d + ", " + y;
	}
	
	//returns string format of what day of week is
	public String dayOfWeek() {
		
		//find difference between date and base date (1/1/2012)
		int diff = this.difference(new CalendarDate(1,1,2012));
		diff %= 7;
		//Since 1/1/2012 is a Sunday we can add the remainder to determine the day of the week
		return findDay(diff).toString();
		
	}
	
	//returns difference between two dates as a integer amount of days
	public int difference(CalendarDate date) {
		int d1 = date.getYear() * 365;
		d1 += date.getDay();
		for(int i = date.getMonth(); i >= 1; --i) {
			d1 += getDaysInMonth(i);
		}
		
		int d2 = year * 365;
		d2 += day;
		for(int i = m; i >= 1; --i) {
			d2 += getDaysInMonth(i);
		}
		
		return (d2 > d1) ? d2-d1 : d1-d2;
		
	}
	
	private Months setMonth(int m) {
		switch(m) {
		case 1:
			return Months.January;
		case 2:
			return Months.February;
		case 3:
			return Months.March;
		case 4:
			return Months.April;
		case 5:
			return Months.May;
		case 6:
			return Months.June;
		case 7:
			return Months.July;
		case 8:
			return Months.August;
		case 9:
			return Months.September;
		case 10:
			return Months.October;
		case 11:
			return Months.November;
		case 12:
			return Months.December;
		default:
			return Months.January;
		}
	}
	
	protected int getDaysInMonth(int m) {
		switch(m) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
	
	private Days findDay(int d) {
		switch(d) {
		case 0:
			return Days.Sunday;
		case 1:
			return Days.Monday;
		case 2:
			return Days.Tuesday;
		case 3:
			return Days.Wednesday;
		case 4:
			return Days.Thursday;
		case 5:
			return Days.Friday;
		case 6:
			return Days.Saturday;
		default:
			return Days.Sunday;	
		}
	}
	
	
	//REturns true if a Months object is found in an array of Months objects
	private boolean monthFoundInArray(Months m, Months[] a) {
		for( Months i : a) {
			if(m.equals(i)) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return month.toString() + " " + day + ", " + year;
	}
}
