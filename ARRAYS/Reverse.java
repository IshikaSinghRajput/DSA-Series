public class Reverse {

    // Recursive Way
    public static void recursiveReverse(int[] arr, int idx) {
        if (idx == arr.length)
            return;

        recursiveReverse(arr, idx + 1);
        System.out.print(arr[idx] + " ");
    }

    // Iterative Way
    public static void iterativeReverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        iterativeReverse(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}