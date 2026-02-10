import java.util.Arrays;

public class LeadersInAnArray {

    public static int[] leadersOfArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int idx = 0;
        int maxRight = arr[n - 1];
        temp[idx++] = maxRight;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                temp[idx++] = maxRight;
            }
        }

        int[] res = new int[idx];
        for (int i = 0; i < idx; i++) {
            res[i] = temp[idx - 1 - i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 2, 5, 2 };
        System.out.println(Arrays.toString(leadersOfArray(arr)));
    }
}
