public class Palindrome {

    public static boolean isPalindrome(int n){
        if(n < 0) return false;

        int temp = n;
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }

        return rev == temp;
    }
    public static void main(String[] args) {
        int n = 122;

        System.out.println(isPalindrome(n));
    }
}
