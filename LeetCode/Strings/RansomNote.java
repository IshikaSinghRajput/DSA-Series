public class RansomNote {

    public static boolean note(String r, String m){
        int[] freq = new int[26];

        for(char c : m.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : r.toCharArray()){
            if(freq[c - 'a'] == 0) return false;
            freq[c - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        String rensome = "aa";
        String magazine = "ab";
        System.out.println(note(rensome, magazine));

    }
}
