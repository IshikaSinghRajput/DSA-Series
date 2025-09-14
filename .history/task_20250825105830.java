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
        int[] arr = { 1, 0, 2, 0, 4, 0 };
        swap(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

}