import java.util.*;

public class task {
    public static void rev(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 0, 1 };
        rev(arr);
        System.out.println(arr.toString());
    }
}
