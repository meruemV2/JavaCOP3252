
public class Employee {

		
	
		 private String first; //first name   
		 private String last; //last name   
		 private String ssn;//socialSecurityNumber
		   
		 //Constructor assigns first and last name, then socialSecurityNumber
		 public Employee(String first, String last, String ssn) 
		 {
		        this.first=first;
		        this.last=last;
		        this.ssn=ssn;
		 }
		   
		 // returns first name
		 public String getFirstName()
		 {
		 return first;
		 }

		 // returns last name
		 public String getLastName()
		 {
		 return last;
		 }

		 // returns social security number
		 public String getSocialSecurityNumber()
		 {
		 return ssn;
		 }
		   
		 // return String Employee object
		@Override
		 public String toString()
		 {
		 return String.format(
		 "Employee: " + getFirstName() + " " + getLastName() + "\n" +
		 "Social Security Number: " + getSocialSecurityNumber() );
		 
		 }
	

}
