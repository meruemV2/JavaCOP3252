import java.util.Random;

public class Word_List {
	
private String[] article;
private String[] noun;
private String[] verb;
private String[] preposition;

private Random r = new Random();

public Word_List()
{
	
article = new String[] {"the", "a", "one", "some", "any"};

noun = new String[] {"boy", "girl", "dog", "town", "car"};

verb = new String[] {"drove", "jumped", "ran", "walked", "skipped"};

preposition = new String[] {"to", "from", "over", "under", "on"};

}

public String getArticle() 
{
return article[r.nextInt(article.length)];
}

public String getNoun() 
{
return noun[r.nextInt(noun.length)];
}

public String getVerb() 
{
return verb[r.nextInt(verb.length)];
}

public String getPreposition() 
{
return preposition[r.nextInt(preposition.length)];
}
}