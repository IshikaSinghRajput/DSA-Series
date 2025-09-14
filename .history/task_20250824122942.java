public class task {
    public static int maxEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 2, 9 };
        int Max = maxEle(arr);
        System.out.println(Max);
    }
}
