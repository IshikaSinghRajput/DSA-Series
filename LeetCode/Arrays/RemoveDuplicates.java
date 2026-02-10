import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 0,2,2,3,3,4};
        int res = removeDuplicates(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, res)));
    }
}