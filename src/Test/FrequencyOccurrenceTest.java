import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class FrequencyOccurrenceTest {
    @Test
    public void getSplitWords() throws Exception {
        String text = "work epAm Home WORK";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        String[] result = {"work", "epam", "home", "work"};
        assertTrue(Arrays.equals(result, frequency.getSplitWords()));
    }

    @Test
    public void getSplitWordsEmpty() throws Exception {
        String text = "";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        String[] result = {""};
        assertTrue(Arrays.equals(result, frequency.getSplitWords()));
    }

    @Test
    public void calculation() throws Exception {
        Map<String, Integer> result = new HashMap<>();
        result.put("epam", 1);
        result.put("home", 2);
        result.put("work", 3);
        String text = "work epAm Home WORK homE worK";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        frequency.calculation();
        assertTrue(result.equals(frequency.getCountWord()));
    }

    @Test
    public void calculationPunctuation() throws Exception {
        Map<String, Integer> result = new HashMap<>();
        result.put("epam!", 1);
        result.put("work,", 1);
        result.put("work?", 1);
        result.put("home.", 1);
        String text = "epam! work, home. work?";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        frequency.calculation();
        assertTrue(result.equals(frequency.getCountWord()));
    }

    @Test
    public void calculationEmpty() throws Exception {
        Map<String, Integer> result = new HashMap<>();
        result.put("", 1);
        String text = "";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        frequency.calculation();
        assertTrue(result.equals(frequency.getCountWord()));
    }

    @Test
    public void setSplitWords() throws Exception {
        Map<String, Integer> result = new HashMap<>();
        result.put("epam", 1);
        result.put("home", 2);
        String text = "epAm Home homE";
        FrequencyOccurrence frequency = new FrequencyOccurrence(text);
        frequency.calculation();
        assertTrue(result.equals(frequency.getCountWord()));

        Map<String, Integer> resultEmpty = new HashMap<>();
        resultEmpty.put("", 1);
        String[] empty = {""};

        frequency.setSplitWords(empty);
        assertTrue(resultEmpty.equals(frequency.getCountWord()));
    }
}