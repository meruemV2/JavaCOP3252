public class Random_Sentence {

private Word_List word_List = new Word_List();

public String getSentence() {

StringBuilder stringBuilder = new StringBuilder();

stringBuilder.append(word_List.getArticle() + " ");

stringBuilder.append(word_List.getNoun() + " ");

stringBuilder.append(word_List.getVerb() + " ");

stringBuilder.append(word_List.getPreposition() + " ");

stringBuilder.append(word_List.getArticle() + " ");

stringBuilder.append(word_List.getNoun());

return stringBuilder.toString();

}

}