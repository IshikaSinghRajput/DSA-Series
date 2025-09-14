public class task {
    public static int maxEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 3, 2, 5, 7 };
        int Max = maxEle(arr);
        System.out.println(Max);
    }
}
