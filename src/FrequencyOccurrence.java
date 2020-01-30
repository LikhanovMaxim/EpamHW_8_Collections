import java.util.HashMap;
import java.util.Map;

public class FrequencyOccurrence {
    private Map<String, Integer> countWord = new HashMap<>();
    private String[] splitWords;

    public FrequencyOccurrence(String english) {
        if (english == null) {
            throw new IllegalArgumentException("In the function FrequencyOccurrence.calculation 'english' = null");
        }
        splitWords = english.toLowerCase().split(" ");
    }

    public void calculation() {
        for (String word : splitWords) {
            if (!countWord.containsKey(word)) {
                countWord.put(word, 1);
            } else {
                countWord.put(word, countWord.get(word) + 1);
            }
        }
    }

    Map<String, Integer> getCountWord() {
        return countWord;
    }

    String[] getSplitWords() {
        return splitWords;
    }

    void setSplitWords(String[] splitWords) {
        this.splitWords = splitWords;
        countWord.clear();
        calculation();
    }
}
