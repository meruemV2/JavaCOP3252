public class Time2 {
  
	private int totalSeconds;
	private int hour = getHour();
    private int minute = getMinute();
    private int second = getSecond();
	
	public Time2()
	{
		totalSeconds = 0;
	}
	
	public Time2(int hour)
	{
	    this(hour, 0, 0);
	}
  
	public Time2(int hour, int minute)
	{
	      this(hour, minute, 0); 
	}
  
	public Time2(int hour, int minute, int second)
	{
		 if (hour < 0 || hour >= 24) {
	         throw new IllegalArgumentException("hour must be 0-23");
	      } 

	      if (minute < 0 || minute >= 60) {
	         throw new IllegalArgumentException("minute must be 0-59");
	      } 

	      if (second < 0 || second >= 60) {
	         throw new IllegalArgumentException("second must be 0-59");
	      } 

		totalSeconds = (60 * minute) + ( 60 * 60 * hour) + second;
	}
	
	
	public Time2(Time2 Time)
	{
		this.totalSeconds = Time.GetTotalSeconds();
	}
  
	public void setTime(int hour, int minute, int second) 
	{
	      if (hour < 0 || hour >= 24) {
	         throw new IllegalArgumentException("hour must be 0-23");
	      } 

	      if (minute < 0 || minute >= 60) {
	         throw new IllegalArgumentException("minute must be 0-59");
	      } 

	      if (second < 0 || second >= 60) {
	         throw new IllegalArgumentException("second must be 0-59");
	      } 

			totalSeconds = (60 * minute) + ( 60 * 60 * hour) + second;

	   } 
	
	public void SetTotalSeconds(int seconds)
	{
		totalSeconds = seconds;
	}	
  
	public void setHour(int hour) 
	{
	      if (hour < 0 || hour >= 24) 
	      {
	         throw new IllegalArgumentException("hour must be 0-23");
	      }

	      this.hour = hour;
	      setTime(hour, minute, second);
	} 

    public void setMinute(int minute)
	 {
	      if (minute < 0 || minute >= 60) 
	      {
	         throw new IllegalArgumentException("minute must be 0-59");
	      }

	      this.minute = minute; 
	      setTime(hour, minute, second);
	  } 

	   public void setSecond(int second) 
	   {
	      if (second < 0 || second >= 60) 
	      {
	         throw new IllegalArgumentException("second must be 0-59");
	      }
	      setTime(hour, minute, second);
	      this.second = second;
	   }  
	
	   
	   
	   public int GetTotalSeconds()
		{
			return totalSeconds;
		}
	  
		public int getHour()
		{
			return totalSeconds / 3600;
		}
	  
		public int getMinute()
		{
			return (totalSeconds % 3600) /60;
		}
	  
		public int getSecond()
		{
			return (totalSeconds % 3600) % 60;
		}
	  
	  
	
	public void tick()
	{
		 int hour = getHour();
	     int minute = getMinute();
	   
		 second = getSecond() + 1;	
		
		if (second >= 60)
        {
            minute = getMinute() + 1;
            second = 0;
        }
		
		if(minute >= 60)
		{
			hour = getHour() +1 ;
			minute = 0;
		}
		
		if(hour >= 24)
		{
			hour = 0;
		}
	      setTime(hour, minute, second);

	}
	
	public void incrementMinute()
	{
		 int hour = getHour();
	     int second = getSecond();
	    
        minute = getMinute() + 1;
		
		if( minute >= 60)
		{
			hour = getHour() +1 ;
			minute = 0;
		}
		
		if(hour >= 24)
		{
			hour = 0;
		}
	      setTime(hour, minute, second);

	}
  
	public void incrementHour()
	{
	     int minute = getMinute();
	     int second = getSecond();
		hour = getHour() +1 ;
		if (hour >= 24)
		{
			hour = 0;
		}
	      setTime(hour, minute, second);

	}
	
  
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
	}

	public String toString()
	{
		return String.format( "%d:%02d:%02d %s",
			( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
			getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	}
}