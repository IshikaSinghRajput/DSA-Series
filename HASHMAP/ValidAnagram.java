import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Check characters in t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // character not in s
            }
            map.put(c, map.get(c) - 1); // decrease count
            if (map.get(c) < 0) {
                return false; // more occurrences than in s
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
    }
}
