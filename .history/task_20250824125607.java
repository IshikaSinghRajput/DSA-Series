import java.util.*;

public class task {
    public static void rev(int[] arr, int i) {
        if (i == arr.length - 1)
            return;
        rev(arr, i);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 0;
    }
}
