import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

     public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] freq = new int[26];
            
            for(char c : s.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int key : freq){
                sb.append('#');
                sb.append(key);
            }

            String k = sb.toString();
            if(!map.containsKey(k)){
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
