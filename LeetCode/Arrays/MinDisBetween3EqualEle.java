class MinDisBetween3EqualEle {

    public static int distance(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;

        if (ans <= 2)
            return -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[j] == arr[k]) {
                            ans = Math.min(ans, 2 * (k - i));
                        }
                    }
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3 };
        System.out.println(distance(arr));

    }
}