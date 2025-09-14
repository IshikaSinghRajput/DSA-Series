import java.util.*;

public class task {

    public static int sum(int[] arr) {
        int n = arr.length - 1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 8, 7, 10 };
        System.out.println(sum(arr));
    }

}