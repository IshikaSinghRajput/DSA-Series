
public class ValidPalindrome {

    public static boolean isPalindrome(String str){
        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int s = 0;
        int e = str.length()-1;

        while(s < e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panaa";
        System.out.println(isPalindrome(s));
    }
}
