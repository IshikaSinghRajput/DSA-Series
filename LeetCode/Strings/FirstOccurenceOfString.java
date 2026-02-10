public class FirstOccurenceOfString {

    public static int occurence(String hs, String nd){
        for(int i = 0; i < hs.length() - nd.length() + 1; i ++){
            if(hs.charAt(i) == nd.charAt(0)){
                if(hs.substring(i, nd.length() + i).equals(nd)) return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String hayStack = "leetcode";
        String needle = "leeto";

        System.out.println(occurence(hayStack, needle));
    }
}
