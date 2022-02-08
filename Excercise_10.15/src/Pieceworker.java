//PieceworkerEmployee class extends Employee.
public class Pieceworker extends Employee{

	//private variables to hold pieces made and wage per piece
	private int pieces; 
	private double wage;
	
	//constructor 
	public Pieceworker( String first, String last, String ssn,
		     double wage, int pieces )
		   {
		     super( first, last, ssn );
		      this.wage = wage;
		      this.pieces = pieces;
		      
		   }

	//wage get function 
	public double getWage() 
	{
		return wage;
	}
	
	//wage set function 
	public void setWage(double wage) 
	{
		if (wage > 0.0)
		{
			this.wage = wage;
		}
		else 
		{
			this.wage = 0.0;
		}
	}
	
	//pieces get function
	public int getPieces() 
	{
		return pieces;
	}

	//pieces set function 
	public void setPieces(int pieces) 
	{
		if (pieces > 0)
		{
		this.pieces = pieces;
		}
		else 
		{
			this.pieces = 0;
		}
	}
	
	//Override function to return employee earnings
	@Override
	public double earnings() 
	{
		 return (getWage()*getPieces());
	}
	
	//String representation of Pieceworker object
	public String toString()
	{
	      return String.format( "%s: %s\n%s: $%,.2f; %s: %,d",
	         "Piece Employee",super.toString(), "$ per piece completed", getWage(),
	         "total pieces", getPieces() );
	}
	
}
