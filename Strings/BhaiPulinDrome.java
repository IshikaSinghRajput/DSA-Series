import java.util.*;

public class BhaiPulinDrome {

    public static boolean isdrome(String str){
        if(str.length() == 1 || str.length() == 0) return true;

        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
       
       return true;
    }

    public static void main(String[] args) {
        String str = "abdcba";
        boolean result = isdrome(str);
        System.out.println(result);
    }
}

