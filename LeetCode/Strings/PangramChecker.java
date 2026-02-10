public class PangramChecker {

    public static boolean isPangram(String st){
        boolean[] seen = new boolean[26];
        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            if(c >= 'a' && c <= 'z') seen[c - 'a'] = true;
            else if(c >= 'A' && c <= 'Z') seen[c - 'A'] = true;
        }

        for(boolean b : seen){
            if(!b) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String st = "Pack my box with five den liquor jugs";
        System.out.println(isPangram(st));
    }
}
