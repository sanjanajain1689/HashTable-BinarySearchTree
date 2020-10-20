import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenASentence_WhenWordsAddedToList_ShouldReturnWordFrequency() {
        String sentence = "To be or not to be";
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            value = (value == null) ? 1 : ++value;
            myHashMap.add(word, value);
        }
        myHashMap.printMap();
        int frequency = myHashMap.get("to");
        Assert.assertEquals(2, frequency);
    }
}