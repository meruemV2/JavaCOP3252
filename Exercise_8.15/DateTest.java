
public class DateTest {

	public static void main(String[] args) 
	{
		Date theDate = new Date(11, 20, 2014);
		
		for (int i = 0; i < 3; i++) 
		{
			
		theDate.nextDay();
		System.out.println(theDate.toString());
		
		}
	} 
}
