// Fig. 15.13: ReadSequentialFile.java
// Reading a file of XML serialized objects with JAXB and a 
// BufferedReader and displaying each object.
import java.io.BufferedReader;      
import java.io.IOException;      
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.bind.JAXB;

public class ReadSequentialFile {
   public static void ReadClients() {
      // try to open file for deserialization
      try(BufferedReader input = 
         Files.newBufferedReader(Paths.get("clients.xml"))) {
         // unmarshal the file's contents
         Accounts accounts = JAXB.unmarshal(input, Accounts.class);
         
         // display contents
         System.out.printf("%-10s%-12s%-12s%10s%n", "\nAccount",
            "First Name", "Last Name", "Balance");

         for (Account account : accounts.getAccounts()) {
            System.out.printf("%-10d%-12s%-12s%10.2f%n",  
               account.getAccountNumber(), account.getFirstName(), 
               account.getLastName(), account.getBalance());
         }
      } 
      catch (IOException ioException) {
         System.err.println("Error opening file.");
      } 
   }
   
   public static void ReadTrans() {
	      // try to open file for deserialization
	      try(BufferedReader input = 
	         Files.newBufferedReader(Paths.get("trans.xml"))) {
	         // unmarshal the file's contents
	         TransactionRecords transactionrecords = JAXB.unmarshal(input, TransactionRecords.class);
	         
	         // display contents
	         System.out.println("\nAccount Transaction amount");

	         for (TransactionRecord transactionrecord : transactionrecords.getRecords()) {
	            System.out.println(transactionrecord.getAccountNumber()+ "   " + transactionrecord.getAmount());
	         }
	      } 
	      catch (IOException ioException) {
	         System.err.println("Error opening file.");
	      } 
	   }
   
}

