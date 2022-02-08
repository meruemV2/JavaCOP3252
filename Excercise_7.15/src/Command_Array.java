
public class Command_Array {
	
public static void main(String[] args) {
// declare variable array and initialize it with an array object
	
	int[] array = new int[10]; // create the array object

	// if statement to check for command line arguments and adjust array size
    if(args.length != 0) 
    {
    	int i = Integer.parseInt(args[0]);

        array = new int[i];
    }

System.out.printf("%s%8s%n", "Index", "Value"); // column headings

 // output each array element's value
 for (int counter = 0; counter < array.length; counter++) {
 System.out.printf("%5d%8d%n", counter, array[counter]);
 }
 }
}
