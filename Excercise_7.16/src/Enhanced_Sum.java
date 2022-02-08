public class Enhanced_Sum {

    public static void main(String[] args) {
    	
        int sum = 0;
        for (String arg : args) 
        {
        	System.out.print(arg + "\n");
            sum += Integer.parseInt(arg);
        }
        
        System.out.print("Sum of arguments is: " + sum);
    }
}