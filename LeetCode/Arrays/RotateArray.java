import java.util.Arrays;

public class RotateArray {

    public static void reverse(int[] arr, int s, int e) {

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { -1,-100,3,99 };
        int k = 2;
        rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
