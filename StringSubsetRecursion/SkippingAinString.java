import java.util.*;

public class SkippingAinString {
    public static void main(String[] args) {
        String ans = "bcapplcd";
        System.out.println(skipApp(ans));
    }

    static String skip(String ans){
        if(ans.isEmpty()){
            return "";
        }

        char ch = ans.charAt(0);

        if(ch == 'a'){
            return skip(ans.substring(1));
        }else{
            return ch + skip(ans.substring(1));
        }

    }

    static String skipApple(String ans){
        if(ans.isEmpty()){
            return "";
        }

        if(ans.startsWith("apple")){
            return skipApple(ans.substring(5));
        }else{
            return ans.charAt(0) + skipApple(ans.substring(1));
        }
    }

    static String skipApp(String ans){
        if(ans.isEmpty()){
            return "";
        }

        if(ans.startsWith("app") && !ans.startsWith("apple")){
            return skipApp(ans.substring(3));
        }else{
            return ans.charAt(0) + skipApp(ans.substring(1));
        }
    }
}
