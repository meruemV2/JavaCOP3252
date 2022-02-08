import java.util.*;

public class Reverse_Sentence

{

public static void main(String[]args)

{

Scanner in = new Scanner(System.in);

String input = "";

System.out.println("Please input a sentence to be reversed...");

input = in.nextLine();

String split[]=input.split(" ");

System.out.println("Here is your sentence in reverse!");

for(int i=split.length-1;i>=0;i--)

{

System.out.print(split[i]+" ");

}

System.out.println();

}
}