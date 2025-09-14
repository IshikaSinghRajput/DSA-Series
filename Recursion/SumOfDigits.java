public class SumOfDigits {
    
    static int sum(int n){

        if(n%10 == 0) return n;

        return (n%10) + sum(n/10);
    }

    public static void main(String[] args) {
        int ans = sum(12345);
        System.out.println(ans);
    }
}
