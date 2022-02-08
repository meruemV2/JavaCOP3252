import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.xml.bind.JAXB;

public class CreateSequentialFile {
	
   public static void createMaster() throws IOException 
   {
	   int acc;
       String firstName;
       String lastName;
       double balance;
       try (PrintWriter pC = new PrintWriter(new FileWriter("clients.xml"), true))
       {
           Accounts accounts = new Accounts(); 
           
			Object[][] accountData = 
				{
			        {100, "Alan", "Jones", 348.17},
			        {300, "Mary", "Smith", 27.19},
			        {500, "Sam", "Sharp", 0.00},
			        {700, "Suzy", "Green", -14.22}
				};

			System.out.println("Creating clients.xml file..");
			
			for (Object individualData[] : accountData) 
			{
			    acc = (int) individualData[0];
			    firstName = (String) individualData[1];
			    lastName = (String) individualData[2];
			    balance = (double) individualData[3];
			    try {
		               Account xmlAccount = new Account(acc, firstName, lastName, balance);
		               accounts.getAccounts().add(xmlAccount);
		            } 
		            catch (NoSuchElementException elementException) {
		               System.err.println("Error: could not add Account: " + acc + " Try again..");
		               
		            } 
			}
			         JAXB.marshal(accounts, pC); 
			         ReadSequentialFile.ReadClients();
		}
       catch (IOException ioException) {
           System.err.println("Error: could not create file..");
        } 
           
   }
   
   public static void createTrans() throws IOException 
   {
       int acc;
       double balance;
       try (PrintWriter pT = new PrintWriter(new FileWriter("trans.xml"), true)) 
       {
    	   TransactionRecords transactionrecords = new TransactionRecords();
    	   
			Object[][] transactionData = 
				{
			        {100, 27.14},
			        {300, 62.11},
			        {400, 100.56},
			        {900, 82.17}
				};
			
			System.out.printf("%nGenerating transaction file...%n");
			
			for (Object individualTransaction[] : transactionData) 
			{
			    acc = (int) individualTransaction[0];
			    balance = (double) individualTransaction[1];
			    try {
		               TransactionRecord record = new TransactionRecord(acc, balance);
		               transactionrecords.getRecords().add(record);
		            } 
		            catch (NoSuchElementException elementException) 
			    		{
		               System.err.println("Error: could not add transaction for Account: " + acc + " Try again..");
		                } 
			}
      JAXB.marshal(transactionrecords, pT); 
      ReadSequentialFile.ReadTrans();
	  }
    catch (IOException ioException) 
       {
        System.err.println("Error: could not create file..");
       } 
   }
}

        