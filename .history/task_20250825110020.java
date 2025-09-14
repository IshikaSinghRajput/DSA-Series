import java.util.*;

public class task {
    public static void swap(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void sum(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        swap(arr, 0, n - 1);
        swap(arr, 0, k - 1);
        swap(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;
        sum(arr, k);
        System.out.println(Arrays.toString(arr));
    }

}