
public class HourlyEmployee extends Employees{
	
	private double hours;	// hours worked by employee
	private double wage;	// hourly rate of pay
	
	//five argument constructor
	public HourlyEmployee(String first, String last, String ssn, 
			double hours, double wage)
	{
		//implicit call to constructor 
		
		super(first, last, ssn);
		
		if (wage < 0.0)
		{throw new IllegalArgumentException(
				   "Wage must be >= 0.0");
		}
		
		if (hours < 0.0 || hours > 168)
		{throw new IllegalArgumentException(
				   "hours must be >= 0.0 and < 168");
		}
		
		
		this.hours = hours;
		this.wage = wage; 
		
	} //end HourlyEmployee constructor
	
	  
	   // set hourly employee's wage amount
	   public void setWage( double wage )
	   {
	      this.wage = ( wage < 0.0 ) ? 0.0 : wage;
	   } // end method setWage

	   // return hourly employee's wage amount
	   public double getWage()
	   {
	      return wage;
	   } // end method getWage

	   // set hourly employee's hours worked
	   public void setHours( double hours )
	   {
	      this.hours = ( hours > 0.0 && hours < 168 ) ? hours : 0.0;
	   } // end method setHours

	   // return commission employee's rate
	   public double getHours()
	   {
	      return hours;
	   } // end method getHours

	   // calculate hourly employee's pay
	   public double earnings()
	   {
	      return hours * wage;
	   } // end method earnings
	
	// return String representation of HourlyEmployee object
	   @Override
	   public String toString()
	   {
	      return String.format( "%s %s%n%s%.2f%n%s%.2f%n%s%.2f", "Commission", super.toString(),
	    			         "Hours Worked: ", getHours(), 
	    			         "Hourly Rate: ", getWage(),
	    			         "Pay Check Amount: ", earnings());
	   } // end method toString
	
}
