public class SearchInRotatedArr {

    // Linear Search
    public static int Search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }

    // Binary Search
    public static int Search2(int[] arr, int k) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k)
                return mid;
            else if (k < arr[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(Search2(arr, 2));
    }

}
