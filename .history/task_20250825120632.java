import java.util.*;

public class task {

    public static int leaders(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (arr[i] < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        leaders(arr);
        System.out.println(leaders(arr));
    }
}