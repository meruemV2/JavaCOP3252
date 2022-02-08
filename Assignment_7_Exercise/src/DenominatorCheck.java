// Fig. 11.3: DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismatchExceptions.
import java.util.InputMismatchException;
import java.util.Scanner;

public class DenominatorCheck
{
   // demonstrates throwing an exception when a divide-by-zero occurs
   public static int quotient(int numerator, int denominator)
      throws ArithmeticException {
      return numerator / denominator; // possible division by zero
   } 

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      boolean continueLoop = true; // determines if more input is needed

      do {       //read input BEFORE try 
    	  System.out.print("Please enter an integer numerator: ");    
          int numerator = scanner.nextInt();                            
          System.out.print("Please enter an integer denominator: ");  
          int denominator = scanner.nextInt();     
    	  
         try {  
        	int n = numerator;
        	int d = denominator;
            int result = quotient(n, d);              
            System.out.printf("%nResult: %d / %d = %d%n", n,     
               d, result);                                     
            continueLoop = false; // input successful; end looping        
         }                                                              
         /*    catch (InputMismatchException inputMismatchException) 
         {        
            System.err.printf("%nException: %s%n",inputMismatchException);                                  
            scanner.nextLine(); // discard input so user can try again    
            System.out.printf(                                          
               "You must enter integers. Please try again.%n%n");          
         }  
         */     //statement irrelevant since numerator and denominator are stored as type integer already                                                       
         catch (ArithmeticException arithmeticException)
         {              
            System.err.println("Exception: " + arithmeticException  + "\nOops, can't do that");
            System.out.printf("Zero is an invalid denominator. Please try again.%n%n");   
         }      
         finally //finally block declared outside of try block
         {
         System.out.println("Numerator is "+numerator);
         System.out.println("Denominator is "+denominator + "\n");
         }
         
      } while (continueLoop);                                           
   } 
} 

