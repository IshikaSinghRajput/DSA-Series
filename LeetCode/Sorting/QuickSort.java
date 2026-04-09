import java.util.Arrays;

class QuickSort {

    public static int partition(int[] arr, int s, int e) {
        int pvt = arr[e];
        int idx = s - 1;

        for (int i = s; i < e; i++) {
            if (arr[i] <= pvt) {
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        // Swap the pivot element to its correct place
        idx++;
        int temp = arr[e];
        arr[e] = arr[idx];
        arr[idx] = temp;

        return idx;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int pvtIdx = partition(arr, s, e);

            quickSort(arr, s, pvtIdx - 1); // Left half
            quickSort(arr, pvtIdx + 1, e); // Right half
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 43, 32, 67, 21 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
