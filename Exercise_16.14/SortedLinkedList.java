import java.util.LinkedList;
import java.security.SecureRandom;
import java.util.Collections;

public class SortedLinkedList{

	public static void main(String[] args0)

	{
		SecureRandom randomNum = new SecureRandom();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		float listAvg = 0;
		int listSum = 0;

		for (int i = 0; i < 25; i++)
		{
			int j = randomNum.nextInt((100));
			list.add(j);
			listSum = list.get(i) + listSum;
		}
		
		listAvg = (float) (listSum / 25.00);
		
		System.out.println("Printing linked list...");

		for (int i = 0; i < 25; i++)
		{
			System.out.println(list.get(i) + " ");
		}
		
		Collections.sort(list);

		System.out.println("\nSorted linked list: ");

		for (int i = 0; i < 25; i++)
		{
			System.out.println(list.get(i) + " ");
		}

		System.out.println("\nSum of numbers in Linked List: " + listSum);
		System.out.println("Average of Linked List: " + listAvg);

	}

}