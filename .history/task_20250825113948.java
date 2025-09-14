import java.util.*;

public class task {

    public static void leaders(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; i < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println("Leaders :" + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 50, 40 };
        leaders(arr);
    }

}