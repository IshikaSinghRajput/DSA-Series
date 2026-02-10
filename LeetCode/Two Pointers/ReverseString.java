import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s){
        int st = 0;
        int e = s.length-1;

        while(st < e){
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;
            st++;
            e--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
