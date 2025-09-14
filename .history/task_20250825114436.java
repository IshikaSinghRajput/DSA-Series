import java.util.*;

public class task {

    public static void leaders(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check all elements to the right
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            // Print leader
            if (isLeader) {
                System.out.println("Leader: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        leaders(arr);
    }
}
