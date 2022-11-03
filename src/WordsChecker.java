import java.util.List;
import java.util.Set;
import java.util.HashSet;
public class WordsChecker {
    protected String text;
    Set<String> set;

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
        set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String request) {
        return set.contains(request);
    }
}
