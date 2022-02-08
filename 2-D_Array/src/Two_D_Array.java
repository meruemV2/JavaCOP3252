public class Two_D_Array {

	public static void main(String[] args) {
	
		int[][] two_array = new int [6][4];
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				two_array[i][j] = (int) ((Math.random()*((9-0) + 1)) + 0);
				
				two_array[i][3] = (two_array[i][3] + two_array[i][j]);
				
				two_array[5][j] = (two_array[5][j] + two_array[i][j]);
				
			}
		}
		System.out.print("Array contents are as follows: \n\n");
		
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.printf("%5d", two_array[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
