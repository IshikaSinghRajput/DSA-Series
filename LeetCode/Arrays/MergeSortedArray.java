import java.util.Arrays;

public class MergeSortedArray {

    public static int[] mergeArray(int[] arr, int[] prr, int m, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[m + n];
        while (i < m && j < n) {
            if (arr[i] <= prr[j]) {
                res[k++] = arr[i++];
            } else {
                res[k++] = prr[j++];
            }
        }
        while (i < m) {
            res[k++] = arr[i++];
        }
        while (j < n) {
            res[k++] = prr[j++];
        }
        return res;
    }

    public static void mergeArray2(int[] arr, int[] prr, int m, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){
            if(arr[i] > prr[j]){
                arr[k--] = arr[i--];
            }
            else{
                arr[k--] = prr[j--];
            }
        }

        while(j >= 0){
            arr[k--] = prr[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 0, 0 };
        int[] prr = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        // System.out.println(Arrays.toString(mergeArray(arr, prr, m, n)));
        mergeArray2(arr, prr, m, n);
        System.out.println(Arrays.toString(arr));

    }
}
