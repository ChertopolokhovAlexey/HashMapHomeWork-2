import java.util.HashSet;
import java.util.Set;
public class WordsChecker {
    protected String text;
    public WordsChecker (String TEXT) {
        this.text = TEXT;
    }
    public boolean hasWord (String request) {
        text = (this.text).toLowerCase();
        String[] textToArray = text.split("\\P{IsAlphabetic}+");
        Set<String> set =new HashSet<>();
        for (String s : textToArray) {
            set.add(s);
        }
        if (set.contains(request)) {
            return true;
        }
        return false;
    }
}
