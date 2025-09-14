import java.util.*;

public class task {
    public static void rev(int[] arr) {
        rev(arr);
        if (arr.length != 0)
            return;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
