import java.util.*;

public class task {
    public static void rev(int[] arr) {
        if (arr.length != 0)
            return;
        rev(arr);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
}
