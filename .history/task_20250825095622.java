import java.util.*;

public class task {

    public static int sum(int[] arr) {
        int prr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                prr = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                prr = arr[j];
            }
        }
        return prr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 8, 7, 10 };
        System.out.println(sum(arr));
    }

}