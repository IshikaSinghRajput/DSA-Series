// "Word Occurrence in a String".

import java.util.HashMap;
import java.util.Map;

public class WordFreq {

    public static void main(String[] args) {
        String str = "this is a test this is";

        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else
                map.put(word, 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());
        }

    }

}
