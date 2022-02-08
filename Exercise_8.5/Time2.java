public class Time2 {
  
	private int totalSeconds;
    private int hour;
    private int minute;
    private int second;
  
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
