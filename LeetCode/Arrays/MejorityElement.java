import java.util.Arrays;

public class MejorityElement {

    public static int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3 };
        System.out.println(majorityElement(arr));
    }
}
