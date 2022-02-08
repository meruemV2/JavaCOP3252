import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.JAXB;

public class Question36 {

	public static void main(String[] args) throws IOException {

		try (PrintWriter pw = new PrintWriter(new FileWriter("output.xml"), true)) {
			Words word = new Words();

			try {
				BufferedReader inputReader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));

				String input;

				while ((input = inputReader.readLine()) != null) {
					String[] words = input.split(" ");
				    List < String > list = new ArrayList < String > ();

					for(int i = 0; i< words.length; i++){
					    list.add(words[i]);
						}
				    Collections.sort(list);
				    for(int i = 0; i< list.size(); i++){
					    word.getWords().add(list.get(i));
						}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			JAXB.marshal(word, pw);
		} catch (IOException ioException) {
			System.err.println("Error opening file. Terminating.");
		}
	}
}
