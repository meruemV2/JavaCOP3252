// Fig. 16.17: WordTypeCount.java
// Program counts the number of occurrences of each word in a String.

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class WordTypeCount

{

      public static void main(String[] args)

      {
            // Create HashMap to store character keys instead of strinng
            Map<Character, Integer> myMap = new HashMap<>();

            createMap(myMap); // create map based on user input
            displayMap(myMap); // display map content
      }

      // create map from user input
      private static void createMap(Map<Character, Integer> map)
      {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
                      
            String[] tokens = input.split(" ");

            for (String token : tokens)
            {
                String c = token.toUpperCase(); // get uppercase word
                  for (Character ch : c.toCharArray())
                  {
                        if (map.containsKey(ch))
                        {
                              int count = map.get(ch);
                              map.put(ch, count + 1);
                        }

                        else {
                              map.put(ch, 1);
                        }
                  }
            }
      }
      //display map content
      private static void displayMap(Map<Character, Integer> map)

      {
            Set<Character> keys = map.keySet();

            TreeSet<Character> sortedKeys = new TreeSet<>(keys);

            System.out.printf("%nMap contains:%nKey\t\tValue%n");

            for (Character key : sortedKeys)

            {
                  System.out.printf("%-10s%10s%n", key, map.get(key));
            }
       
            System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
      }
}