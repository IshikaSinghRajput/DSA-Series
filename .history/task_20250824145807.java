import java.util.*;

public class task {

    public static void sort(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}