// Fig. 15.10: Accounts.java
// Maintains a List<Account>
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class TransactionRecords {
   // @XmlElement specifies XML element name for each object in the List
   @XmlElement(name="transactionrecord") 
   private List<TransactionRecord> transactionrecords = new ArrayList<>(); // stores Accounts

   // returns the List<Accounts>
   public List<TransactionRecord> getRecords() {return transactionrecords;}
}
