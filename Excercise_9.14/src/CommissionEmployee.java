
// Fig. 9.4: CommissionEmployee.java
// CommissionEmployee class represents a commission employee.

public class CommissionEmployee extends Employee
{
 
   private double sales; // gross weekly sales
   private double rate; // commission percentage

   // five-argument constructor
   public CommissionEmployee( String first, String last, String ssn, 
      double sales, double rate )
   {
    // implicit call to Object constructor occurs here
	   
	   super(first, last, ssn);
	   
	// if grossSales is invalid throw exception
	  if (sales < 0.0)
	  throw new IllegalArgumentException(
	   "Gross sales must be >= 0.0");
	  
	           // if commissionRate is invalid throw exception
	  if (rate <= 0.0 || rate >= 1.0)
	  throw new IllegalArgumentException(
	  "Commission rate must be > 0.0 and < 1.0");
	   
     
      this.sales = sales; // validate and store gross sales
      this.rate = rate; // validate and store commission rate
   } // end five-argument CommissionEmployee constructor

   
   
   // set commission employee's gross sales amount
   public void setGrossSales( double sales )
   {
      this.sales = ( sales < 0.0 ) ? 0.0 : sales;
   } // end method setGrossSales

   // return commission employee's gross sales amount
   public double getGrossSales()
   {
      return sales;
   } // end method getGrossSales

   // set commission employee's rate
   public void setCommissionRate( double rate )
   {
      this.rate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } // end method setCommissionRate

   // return commission employee's rate
   public double getCommissionRate()
   {
      return rate;
   } // end method getCommissionRate

   // calculate commission employee's pay
   public double earnings()
   {
      return rate * sales;
   } // end method earnings

   // return String representation of CommissionEmployee object
   @Override
   public String toString()
   {
      return String.format( "%s %s%n%s%.2f%n%s%.2f%n%s%.2f", "Commission", super.toString(),
    			         "Gross Sales: ", getGrossSales(), 
    			         "Commission Rate: ", getCommissionRate(),
    			         "Pay Check Amount: ", earnings());
   } // end method toString
} // end class CommissionEmployee