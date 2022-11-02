import java.util.Collections;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set;

    public WordsChecker(String TEXT, Set<String> set) {
        this.text = TEXT;
        this.set = set;
    }

    public boolean hasWord(String request) {
        text = (this.text).toLowerCase();
        String[] textToArray = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(set, textToArray);
        return set.contains(request);
    }
}
