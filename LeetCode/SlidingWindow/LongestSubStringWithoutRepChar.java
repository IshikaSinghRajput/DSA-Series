import java.util.HashMap;

public class LongestSubStringWithoutRepChar {

    public static int longestSubString(String s){
        int left = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubString(s));
    }
}
