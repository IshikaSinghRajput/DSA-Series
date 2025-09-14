public class Product {

    static int product(int n){

        if(n%10 == n) return n;

        return (n%10) * product(n/10);
    }
    
    public static void main(String[] args) {
        int ans = product(504);
        System.out.println(ans);
    }
}
