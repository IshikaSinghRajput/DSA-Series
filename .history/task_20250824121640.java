public class task {
    public static int maxEle(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 9 };
        int Max = maxEle(arr);
        System.out.println(Max);
    }
}
