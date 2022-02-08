import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

import javax.xml.bind.JAXB;

class FileMatch {
  

    public static void Match() throws IOException {
    
    	
        try (PrintWriter pw = new PrintWriter(new FileWriter("newclients.xml"), true))
        {
	         Accounts newAccounts = new Accounts(); 

        
        try(BufferedReader transReader = Files.newBufferedReader(Paths.get("trans.xml"));
                BufferedReader accountReader = Files.newBufferedReader(Paths.get("clients.xml"))){
                	
                	

             // unmarshal the file's contents
             Accounts accounts = JAXB.unmarshal(accountReader, Accounts.class);
                    
	         // unmarshal the file's contents
	         TransactionRecords transactionrecords = JAXB.unmarshal(transReader, TransactionRecords.class);
      
	         Account acc = new Account();
	         TransactionRecord tr = new TransactionRecord();

	         
        for (Account account : accounts.getAccounts())
        {
        	acc.setFirstName(account.getFirstName());
        	acc.setLastName(account.getLastName());
        	acc.setAccountNumber(account.getAccountNumber());
        	acc.setBalance(account.getBalance());

        	for ( TransactionRecord transactionrecord : transactionrecords.getRecords())

        	{
        		tr.setAccountNumber(transactionrecord.getAccountNumber());
        		tr.setAmount(transactionrecord.getAmount());
        		
        		if(acc.getAccountNumber() == tr.getAccountNumber()) 
        		{
                     System.out.printf("%nMatch found! Account %d's balance has been increaded by %.2f.%n", tr.getAccountNumber(), tr.getAmount());
                     System.out.println("Now it is " + acc.combine(tr));
                     System.out.println("Saving new data to 'newclients.xml'");
                     acc.setBalance(acc.combine(tr));
                     
                     try {
                         
      	               Account record = new Account(acc.getAccountNumber(),acc.getFirstName(), acc.getLastName(), acc.getBalance());

      	               // add to AccountList
      	               newAccounts.getAccounts().add(record);
      	            } 
      	            catch (NoSuchElementException elementException) {
      	               System.err.println(" Error: bad account reading.. Please try again.");
      	               
      	            } 
              	      break;
                 }
         	}
        	
        	if (acc.getBalance() == account.getBalance())	
        	{
        		try {
   	               Account record = new Account(acc.getAccountNumber(),acc.getFirstName(), acc.getLastName(), acc.getBalance());

   	               // add to AccountList
   	               newAccounts.getAccounts().add(record);
   	            } 
   	            catch (NoSuchElementException elementException) {
   	               System.err.println(" Error: bad account reading.. Please try again.");
   	               
   	            } 
        	}
	
        }
    }
                catch (IOException ioException) {
                    System.err.println("Error opening file.");
                 } 

    	// write AccountList's XML to output
        JAXB.marshal(newAccounts, pw); 
  		}
      catch (IOException ioException) {
          System.err.println("Error opening file. Terminating.");
       } 
       
    }  
}