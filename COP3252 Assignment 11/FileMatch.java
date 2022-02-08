import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class FileMatch {
  
    public static void testMatch() throws IOException 
    {
        PrintWriter pNM = new PrintWriter(new FileWriter("newmast.txt"),true);
        PrintWriter pL = new PrintWriter(new FileWriter("log.txt"),true);

        BufferedReader tReader = new BufferedReader(new InputStreamReader(new FileInputStream("trans.txt")));
        BufferedReader aReader = new BufferedReader(new InputStreamReader(new FileInputStream("oldmast.txt")));
        
        Account acc = new Account();
        TransactionRecord tr = new TransactionRecord();
        
        String transaction;
        int accNum=0;
        
        while((transaction=tReader.readLine())!=null)
        {
            Object[] tSplit = transaction.split(" ");

            accNum = Integer.parseInt((String) tSplit[0]);
            double tNum = Double.parseDouble((String) tSplit[1]);
            
            tr.setAccountNumber(accNum);
            tr.setAmount(tNum);
            
            String account;
            String firstName, lastName;
            while((account=aReader.readLine())!=null)
            {
                Object[] aSplit = account.split(" ");

                firstName = (String) aSplit[1];
                lastName = (String) aSplit[2];
                acc.setAccountNumber(Integer.parseInt((String) aSplit[0]));
                acc.setBalance(Double.parseDouble((String) aSplit[3]));
                
                if(accNum==acc.getAccountNumber()) 
                {
                    System.out.printf("%nAccount: %d has been changed by %.2f.%n", accNum, tNum);
                    System.out.println("New account balance is: " + acc.combine(tr));
                    System.out.println("Saving to 'newmast.txt'...");
           
                    pNM.println(acc.getAccountNumber() + " " + firstName + " " + lastName + " " + acc.combine(tr));
                    break;
                }
                
            }
            
            if(accNum != acc.getAccountNumber()) 
            {
            System.out.println("\nUnmatched transaction record for account number: " + tr.getAccountNumber());
            System.out.println("Saving transaction to 'log.txt'\n");
            pL.println(tr.getAccountNumber() + " " + tr.getAmount());
            
            }
        }
        tReader.close();
        aReader.close();
        pNM.close();
        pL.close();
    }
}