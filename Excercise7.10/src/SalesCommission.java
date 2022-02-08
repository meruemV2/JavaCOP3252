

public class SalesCommission {

	public static void main(String[] args) {
				
		int salesTotal[] = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};
		
		double[] salary = new double[9];
		int[] range = new int[9];
		
		for(int i = 0; i < 9; i++)
		{
			salary[i] = salesTotal[i]*0.09+200;
			
			int bracket = (int)(salary[i]/100);
			
			if(bracket > 10)
			{
				bracket = 10;
			}
			
			++range[bracket-2];
			
		}
		
		for (int i = 0; i < 8; i++ )
			{
			System.out.printf("$%d-$%d\t%d\n", (200+100*i),(299+100*i), range[i]);
			}
			System.out.printf("$1000 and over\t%d\n", range[7]);
		

	}

}
