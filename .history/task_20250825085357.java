import java.util.*;

public class task {

    public static int sum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        int max = arr[0];
        for (int i = 0; i <= n; i++) {
            if (arr[i] > max) {
                max = arr[i - 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        sum(arr);
        System.out.println(sum(arr));
    }

}