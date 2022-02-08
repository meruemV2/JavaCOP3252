//Words.java
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class Words {
	@XmlElement(name = "word")
	private static List<String> words = new ArrayList<>();

	public static List<String> getWords() {
		return words;
	}
}