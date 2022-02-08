public class VLA_List {

	public static int product(int...num)
		{
			int product = 1;
			for (int n : num )
				product *= n;
			
			return product;
		}
	public static void main(String[] args) {
		
		    System.out.println("The product of 2 is "+ product(2));
	        System.out.println("The product of 2 times 2 is "+ product(2,2));
	        System.out.println("The product of 2 times 2 times 2 is " + product(2,2,2));
	        System.out.println("The product of 2 times 2 times 2 times 3 is "+ product(2,2,2,3));
	        System.out.println("The product of 2 times 2 times 2 times 3 times 4 is "+ product(2,2,2,3,4));

	}
}
