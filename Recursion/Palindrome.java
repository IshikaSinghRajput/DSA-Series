public class Palindrome {

    static boolean palindrome(int num){
        return num == reverse(num, 0);
    }

    static int reverse(int num, int rev){
        if(num == 0) return rev;

        return reverse(num/10, rev*10 + num%10);
    }

    public static void main(String args[]){
        int num = 1231;
        System.out.println(palindrome(num));
    }
}
