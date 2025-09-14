public class task {
    public static int maxEle(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, 1, -5, 3 };
        int Max = maxEle(arr);
        System.out.println(Max);
    }
}
