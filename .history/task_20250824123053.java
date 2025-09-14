public class task {
    public static int maxEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int Max = maxEle(arr);
        System.out.println(Max);
    }
}
