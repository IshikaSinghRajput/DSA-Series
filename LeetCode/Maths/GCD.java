public class GCD {
    public static void main(String[] args) {
        int a = 19;
        int b = 12;

        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }
}
