
public class Sentence_Generator {

public static void main(String[] args) {

Random_Sentence random_Sentence = new Random_Sentence();

System.out.println("List of 20 random sentences..");

for(int i = 1; i <= 20; i++) {

System.out.println(random_Sentence.getSentence());

}

}

}