import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] arr, int[] prr) {
        Arrays.sort(arr);
        Arrays.sort(prr);
        int i = 0;
        int j = 0;
        int[] res = new int[Math.min(arr.length, prr.length)];
        int idx = 0;

        while (i < arr.length && j < prr.length) {
            if (arr[i] == prr[j]) {
                res[idx++] = arr[i];
                i++;
                j++;
            } else if (arr[i] < prr[j])
                i++;
            else
                j++;
        }
        return Arrays.copyOf(res, idx);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };                                       
        int[] prr = { 2, 2 };

        int[] result = intersection(arr, prr);
        System.out.println(Arrays.toString(result));
    }
}
