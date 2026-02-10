import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr){
        int n = arr.length;
        int expectedSum = n * (n + 1)/2;
        int actualSum = 0;
        for(int i = 0; i < n; i++){
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    public static int missingNumber2(int[] arr){
        int n = arr.length;
        int xor = 0;

        for(int i = 0; i <= n; i++){
            xor ^= i;
        }

        for(int i = 0; i < n; i++){
            xor ^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,3,2,5};
        int res = missingNumber2(arr);
        System.out.println(res);
    }
}
