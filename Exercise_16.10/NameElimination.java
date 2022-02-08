import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class NameElimination {

	 public static void main(String[] args){

		 List<String> firstNames1 = new ArrayList<String>();

         Scanner scanner = new Scanner(System.in);
        	
        	String input = null;
        	String end = "1";
		    System.out.println("Please enter list of first names. Enter '1' to conclude list..\n");

			while  (!end.equals(input)) {
			    System.out.println("Please enter first name..");
			    input = scanner.nextLine();
			    if (end.equals(input))
			    	break;
			    else
			    firstNames1.add(input);
			}
		
			System.out.printf("%s ", firstNames1);
			System.out.println();

			
			Set<String> set = eliminateCopies(firstNames1);
			
			System.out.println("Enter First Name to Search for: ");

			String searchName = scanner.nextLine();
			
			searchHashSet(set, searchName);

    }

    private static  Set<String> eliminateCopies(Collection<String> values) {

    	Set<String> nameSet = new HashSet<String>(values);

        System.out.println("Deleting copies...\n");
        
        for (String name : nameSet) {
            System.out.printf("%s ", name);
        }
        System.out.println();
        
        return nameSet;
    }

    public static void searchHashSet(Set<String> names, String check) {

        Set<String> nameSet = new HashSet<String>(names);

        if(nameSet.contains(check)) {
        	System.out.println("Name: " + check + " found!");
        }
        else {
        	System.out.println("Name: " + check + "not found. Try again..");
        }
    }
}
