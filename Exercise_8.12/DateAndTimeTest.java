
public class DateAndTimeTest {

	public static void main(String[] args) {
		
		DateAndTime dateTime0 = new DateAndTime();

	
		DateAndTime dateTime1 = new DateAndTime(11, 15, 2009, 17, 45, 30);
		
		System.out.println(" add 11 days");
		for ( int i = 0; i < 11; i++)
		{
		dateTime1.nextDay();
		System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");
		
		
		System.out.println(" add 23 hours");
		for (int i = 0; i < 23; i++)
		{
			dateTime1.incrementHour();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");
		
		
		System.out.println(" add 61 minutes");
		for (int i = 0; i < 61; i++)
		{
			dateTime1.incrementMinute();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");
		
		
		System.out.println(" add 6 hours");
		for (int i = 0; i < 6; i++)
		{
			dateTime1.incrementHour();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");
		
		
		System.out.println(" add 15 minutes");
		for (int i = 0; i < 15; i++)
		{
			dateTime1.incrementMinute();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");

		
		System.out.println(" add 33 days");
		for (int i = 0; i < 33; i++)
		{
			dateTime1.nextDay();
			System.out.println(dateTime1.toString());
		}
		System.out.println("\n");

		
		System.out.println(" add 23 hours");
		for (int i = 0; i < 23; i++)
		{
			dateTime1.incrementHour();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");

		
		System.out.println(" add 58 minutes");
		for (int i = 0; i < 58; i++)
		{
			dateTime1.incrementMinute();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");
		
		
		System.out.println(" add 31 seconds");
		for (int i = 0; i < 31; i++)
		{
			dateTime1.tick();
			System.out.println(dateTime1.toString() );
		}
		System.out.println("\n");


		
	}

}
