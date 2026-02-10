public class AddDigits {

    public static int addDigit(int n){
        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n = n / 10;
            }
            n = sum;
        }

        return n;
    }
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigit(n));
    }
}
