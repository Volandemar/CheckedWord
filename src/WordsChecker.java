import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
    }

    protected boolean hasWord(String word) {
        Set<String> setText = new HashSet<>();
        String[] splitText = text.split("\\P{IsAlphabetic}+");

        setText.addAll(List.of(splitText));

        if (setText.contains(word.toLowerCase())) {
            System.out.println("Слово " + word + " присутствует в тексте.");
            return true;
        }
        System.out.println("Слово " + word + " отсутствует в тексте.");
        return false;

    }
}
