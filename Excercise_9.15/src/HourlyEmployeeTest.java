
public class HourlyEmployeeTest {

	public static void main(String[] args) {
		
		
		 HourlyEmployee hourly = new HourlyEmployee("John", "Hoplin", "111-11-1111", 20, 40);
	       //calling toString method on hourlyEmp
	       System.out.println(hourly.toString());
	       
	       
	       System.out.println( 
	               "\n\nEmployee information obtained by get methods: \n" );
	            System.out.printf( "%s %s\n", "First name is",
	               hourly.getFirstName() );
	            System.out.printf( "%s %s\n", "Last name is", 
	               hourly.getLastName() );
	            System.out.printf( "%s %s\n", "Social security number is", 
	               hourly.getSocialSecurityNumber() );
	            System.out.printf( "%s %.2f\n", "Hours worked is", 
	              hourly.getHours() );
	            System.out.printf( "%s %.2f\n", "Hourly rate is",
	               hourly.getWage() );
	     
	           hourly.setHours(55); // set hours worked
	           hourly.setWage( 35.25 ); // set wage rate
	           
	           System.out.printf( "\n%s:\n\n%s\n", 
	              "Updated employee information obtained by toString", hourly);
	}

}
