import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {
    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
        String para = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = para.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            value = (value == null) ? 1 : ++value;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        int frequency = myLinkedHashMap.get("paranoid");
        Assert.assertEquals(3, frequency);
    }

    @Test
    public void givenAKey_WhenExistsInLinkedHashMap_ShouldBeDeleted() {
        String para = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves " +
                "deliberately into paranoid avoidable " +
                "situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = para.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            value = (value == null) ? 1 : ++value;
            myLinkedHashMap.add(word, value);
        }
        System.out.println(myLinkedHashMap);
        String key = "avoidable";
        myLinkedHashMap.remove(key);
        Assert.assertEquals(null, myLinkedHashMap.get("avoidable"));
        System.out.println(myLinkedHashMap);
    }
}

