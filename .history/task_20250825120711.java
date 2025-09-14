import java.util.*;

public class task {

    public static int leaders(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - 1; i++) {
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (arr[i] < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        leaders(arr);
        System.out.println(leaders(arr));
    }
}