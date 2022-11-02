//https://github.com/ChertopolokhovAlexey/HashMapHomeWork-2.git

import java.util.HashSet;
import java.util.Set;

public class Main {
    static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
            " ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat" +
            " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    static final String REQUEST = "nisiw";


    public static void main(String[] args) {
        String request = REQUEST.toLowerCase();
        Set<String> set = new HashSet<>();

        WordsChecker wordsChecker = new WordsChecker(TEXT, set);
        System.out.println(wordsChecker.hasWord(request));
    }

}
