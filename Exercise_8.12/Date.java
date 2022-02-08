public class Date {
	

   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   private int MAX_VALUE = 2020;
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year) {
      // check if month in range
      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
      }

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");
      }

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
      }
      
      if( year <= 0 || year > MAX_VALUE) {
    	  throw new IllegalArgumentException("year (" + year + ") "
    	  		+ "must be between 0 and " + MAX_VALUE);
      }
   
      this.month = month;
      this.day = day;
      this.year = year;

   } 
   
   
   public void nextDay() 
   {
	   if (day == 28 && month == 2 && year % 400 == 0) 
	   {
		   
	      day ++;
	   } 
	   
	   else if (day >= daysPerMonth[month]) 
	   {
		   
		   nextMonth();
	   } 
	   
	   else	   
	   day ++;
   	}
	   
   public void nextMonth() 
   {
	   if (month == 12) 
	   {
		   
		   nextYear();
	   } 
	   else 
	   {
		   month++;
		   day = 1;
	   }
	}

   public void nextYear() 
   {
	   year++;
	   month = 1;
	   day = 1;
   }
   
   public int getDay()
   {
   return day;
   }
   
   public int getMonth()
   {
   return month;
   }
   
   public int getYear()
   {
	   return year;
	   }
   // return a String of the form month/day/year
   public String toString() {
      return String.format("%d/%d/%d", month, day, year); 
   } 
} 
