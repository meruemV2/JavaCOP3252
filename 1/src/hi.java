
import java.util.Scanner;

public class hi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int sum;
		int average;
		int product;
		int smallest;
		int largest;
		
		System.out.print("Enter First Integer: ");;
		num1 = input.nextInt();
		
		System.out.print("Enter Second Integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter Third Integer: ");
		num3 = input.nextInt();
		
		sum = num1 + num2 + num3;
		average = sum/3;
		product = (num1 * num2 * num3);
		
		largest = num1;
	    smallest = num1;

	    if(num2 > largest)
	    largest = num2;

	    if(num3 > largest)
	    largest = num3;

	    if(num2 < smallest)
	    smallest = num2;

	    if (num3 < smallest)
	    smallest = num3;
	    
	    System.out.println("Sum: " + sum);

        System.out.println("Average: " + average);

        System.out.println("Product: " + product);
	    
        System.out.println("Smallest: " + smallest);
        
        System.out.println("Largest: " + largest);
	    
	}

}
