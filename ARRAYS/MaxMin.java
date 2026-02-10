class MaxMin {

    public static int maxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 7, 9, 4 };
        System.out.println(maxMin(arr));
    }
}