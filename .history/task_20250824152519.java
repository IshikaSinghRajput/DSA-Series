import java.util.*;

public class task {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 2, 4 };
        sum(arr);
        System.out.println(Arrays.toString(arr));
    }

}