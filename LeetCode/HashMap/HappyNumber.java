import java.util.HashSet;

public class HappyNumber {

    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            n = sum(n);
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
