class MinDistToTargetEle {

    public static int distance(int[] arr, int target, int start) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = Math.min(ans, Math.abs(i - start));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(distance(arr, 5, 3));
    }
}