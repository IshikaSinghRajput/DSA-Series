public class LCM {
    public static int gcd(int a, int b){
          while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println(lcm(a, b));
    }
}
