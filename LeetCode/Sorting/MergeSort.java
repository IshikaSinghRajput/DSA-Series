import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int s, int mid, int e){
        int[] temp = new int[e - s + 1];
        int i = s, j = mid + 1, k = 0;
        while(i <= mid && j <= e){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i];
                i++;
            }
            else{
                temp[k++] = arr[j];
                j++;
            }
        }

        while(i <= mid){
            temp[k++] = arr[i];
            i++;
        }

        while(j <= e){
            temp[k++] = arr[j];
            j++;
        }

        for(int idx = 0; idx < temp.length; idx++){
            arr[idx + s] = temp[idx];
        }
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (s < e) {
            int mid = s + (e - s) / 2;

            // Left half
            mergeSort(arr, s, mid);
            // Right half
            mergeSort(arr, mid + 1, e);

            // merge
            merge(arr, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 43, 32, 67, 21 };
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
