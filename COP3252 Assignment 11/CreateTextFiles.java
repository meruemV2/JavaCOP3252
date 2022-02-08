import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class CreateTextFiles {
    
	
    public static void createMaster() throws IOException 
    {
        int acc;
        String name;
        double balance;
        try (PrintWriter pOM = new PrintWriter(new FileWriter("oldmast.txt"), true))
        
        {
		
			Object[][] accountData = 
				{
			        {100, "Alan Jones", 348.17},
			        {300, "Mary Smith", 27.19},
			        {500, "Sam Sharp", 0.00},
			        {700, "Suzy Green", -14.22}
				};

			System.out.println("Accounts in oldmast.txt:");
			
			for (Object individualData[] : accountData) 
				
			{
			    acc = (int) individualData[0];
			    name = (String) individualData[1];
			    balance = (double) individualData[2];
			    System.out.println(acc + " " + name + " " + balance);
			    pOM.println(acc + " " + name + " " + balance);
			}
		}
    }

  
    public static void createTrans() throws IOException 
    {
        int acc;
        double balance;
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("trans.txt"), true)) {
			
			Object[][] transactionData = 
				{
			        {100, 27.14},
			        {300, 62.11},
			        {400, 100.56},
			        {900, 82.17}
				};
			
			System.out.printf("%nContents of trans.txt:%n");
			
			for (Object individualTransaction[] : transactionData) 
			{
			    acc = (int) individualTransaction[0];
			    balance = (double) individualTransaction[1];
			    System.out.println(acc + " " + balance);
			    pw.println(acc + " " + balance);
			}
		}
    }
}

