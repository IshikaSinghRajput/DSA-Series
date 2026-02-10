public class PowerOfThree {

    public static boolean isPower(int n){
        if(n < 1) return false;

        while(n % 3 == 0) n = n / 3;

        return n == 1;
    }
    public static void main(String[] args) {
        int n = 27;

        System.out.println(isPower(n));
    }

}
