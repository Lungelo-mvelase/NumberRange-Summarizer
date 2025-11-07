package number.summarizer;

// public class NumberSummarizerTest {
  
// }

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class NumberSummarizerTest {

    @Test
    public void testCollect() {
        NumberSummarizer summarizer = new NumberSummarizer();
        Collection<Integer> result = summarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");

        assertTrue(result.containsAll(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31)));
        assertEquals(14, result.size());
    }

    @Test
    public void testSummarizeCollection() {
        NumberSummarizer summarizer = new NumberSummarizer();
        Collection<Integer> input = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        String result = summarizer.summarizeCollection(input);
        assertEquals("1,3,6-8,12-15,21-24,31", result);
    }

    @Test
    public void testSingleNumbers() {
        NumberSummarizer summarizer = new NumberSummarizer();
        Collection<Integer> input = Arrays.asList(1,3,5);
        String result = summarizer.summarizeCollection(input);
        assertEquals("1,3,5", result);
    }

    @Test
    public void testContinuousNumbers() {
        NumberSummarizer summarizer = new NumberSummarizer();
        Collection<Integer> input = Arrays.asList(1,2,3,4,5);
        String result = summarizer.summarizeCollection(input);
        assertEquals("1-5", result);
    }
}